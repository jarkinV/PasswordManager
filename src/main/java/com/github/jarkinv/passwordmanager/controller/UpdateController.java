package com.github.jarkinv.passwordmanager.controller;

import static com.github.jarkinv.passwordmanager.domain.StateEnum.ENTER_URL;
import static com.github.jarkinv.passwordmanager.domain.StateEnum.ENTER_USERNAME;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

import com.github.jarkinv.passwordmanager.domain.State;
import com.github.jarkinv.passwordmanager.domain.StateEnum;
import com.github.jarkinv.passwordmanager.domain.Url;
import com.github.jarkinv.passwordmanager.dto.ChatDto;
import com.github.jarkinv.passwordmanager.dto.MessageDto;
import com.github.jarkinv.passwordmanager.dto.MessageEntityDto;
import com.github.jarkinv.passwordmanager.dto.UpdateDto;
import com.github.jarkinv.passwordmanager.service.LoginService;
import com.github.jarkinv.passwordmanager.service.StateService;
import com.github.jarkinv.passwordmanager.service.UrlService;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.request.SetWebhook;
import com.pengrad.telegrambot.response.BaseResponse;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateController {

    @Autowired
    private TelegramBot telegramBot;

    @Autowired
    private StateService stateService;

    @Autowired
    private UrlService urlService;

    @Autowired
    private UrlValidator urlValidator;

    @Autowired
    private LoginService loginService;

    @PostMapping("/update")
    public void handleUpdate(@RequestBody UpdateDto update) {
        MessageDto message = update.getMessage();
        Integer userId = message.getFrom().getId();
        ChatDto chat = message.getChat();
        String msg = "";
        String command = getCommand(message);
        if (Objects.nonNull(command)) {
            switch (command) {
            case "/newPassword":
                msg = "Enter URL";
                stateService.save(new State(userId, ENTER_URL));
                break;
            case "/getPassword":

                break;
            }
        } else {
            StateEnum state = stateService.getCurrentStateByUserId(userId);
            if (Objects.nonNull(state)) {
                switch (state) {
                case ENTER_URL:
                    if (urlValidator.isValid(message.getText())) {
                        urlService.createUrlIfNeeded(message.getText(), userId);
                        msg = "Enter username";
                        State stateEnterUsername = new State(userId, ENTER_USERNAME);
                        stateEnterUsername.setTemp(message.getText());
                        stateService.save(stateEnterUsername);
                    } else {
                        msg = "Invalid URL";
                    }
                    break;
                case ENTER_USERNAME:
                    String urlMessage = stateService.getLastTempByUserIdAndStateEnum(userId, ENTER_USERNAME);
                    Url url = urlService.getByUrlAndUserId(urlMessage, userId);
                    msg = loginService.createLogin(message.getText(), message.getFrom().getId().toString(), url);
                    break;
                }
            } else {
                msg = "Hello ";
                stateService.save(new State(userId, StateEnum.START));
            }
        }
        SendMessage messageRequest = new SendMessage(message.getChat().getId(), msg);
        telegramBot.execute(messageRequest);
    }

    private String getCommand(MessageDto message) {
        if (message.getEntities() == null) {
            return null;
        }
        for (MessageEntityDto messageEntity : message.getEntities()) {
            if (MessageEntityDto.Type.BOT_COMMAND.equals(messageEntity.getType())) {
                String text = message.getText();
                return text.substring(messageEntity.getOffset(), messageEntity.getOffset() + messageEntity.getLength());
            }
        }
        return null;
    }

    @GetMapping("/update")
    public BaseResponse updateWebhook(HttpServletRequest request) {
        StringBuffer requestURL = request.getRequestURL();
        requestURL.insert(4, 's');
        SetWebhook setWebhook = new SetWebhook().url(requestURL.toString());
        return telegramBot.execute(setWebhook);
    }
}
