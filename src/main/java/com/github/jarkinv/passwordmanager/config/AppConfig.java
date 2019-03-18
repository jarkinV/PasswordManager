package com.github.jarkinv.passwordmanager.config;

import com.pengrad.telegrambot.TelegramBot;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${telegram.token}")
    private String token;

    @Bean
    public TelegramBot getTelegramBot() {
        return new TelegramBot(token);
    }

    @Bean
    public UrlValidator getUrlValidator() {
        return new UrlValidator();
    }
}
