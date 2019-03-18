package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MessageEntityDto {
    @JsonProperty("type")
    private Type type;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("url")
    private String url;
    @JsonProperty("user")
    private UserDto user;


    public enum Type {
        @JsonProperty("hashtag")
        HASH_TAG,
        @JsonProperty("cashtag")
        CASH_TAG,
        @JsonProperty("bot_command")
        BOT_COMMAND,
        @JsonProperty("url")
        URL,
        @JsonProperty("email")
        EMAIL,
        @JsonProperty("phone_number")
        PHONE_NUMBER,
        @JsonProperty("mention")
        MENTION,
        @JsonProperty("bold")
        BOLD,
        @JsonProperty("italic")
        ITALIC,
        @JsonProperty("code")
        CODE,
        @JsonProperty("pre")
        PRE,
        @JsonProperty("text_link")
        TEXT_LINK,
        @JsonProperty("text_mention")
        TEXT_MENTION;
    }
}
