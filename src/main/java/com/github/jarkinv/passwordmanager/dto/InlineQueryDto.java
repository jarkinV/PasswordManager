package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InlineQueryDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty("from")
    private UserDto from;
    @JsonProperty("location")
    private LocationDto location;
    @JsonProperty("query")
    private String query;
    @JsonProperty("offset")
    private String offset;
}
