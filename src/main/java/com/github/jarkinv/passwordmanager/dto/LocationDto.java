package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LocationDto {
    @JsonProperty("longitude")
    private Float longitude;
    @JsonProperty("latitude")
    private Float latitude;
}
