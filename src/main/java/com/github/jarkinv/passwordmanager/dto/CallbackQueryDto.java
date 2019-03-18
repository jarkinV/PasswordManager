package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CallbackQueryDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty("from")
    private UserDto from;
    @JsonProperty("message")
    private MessageDto message;
    @JsonProperty("inline_message_id")
    private String inlineMessageId;
    @JsonProperty("chat_instance")
    private String chatInstance;
    @JsonProperty("data")
    private String data;
    @JsonProperty("game_short_name")
    private String gameShortName;
}
