package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChosenInlineResultDto {
    @JsonProperty("result_id")
    private String resultId;
    @JsonProperty("from")
    private UserDto from;
    @JsonProperty("location")
    private LocationDto location;
    @JsonProperty("inline_message_id")
    private String inlineMessageId;
    @JsonProperty("query")
    private String query;
}
