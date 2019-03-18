package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MaskPositionDto {
    @JsonProperty("point")
    private String point;
    @JsonProperty("x_shift")
    private Float xShift;
    @JsonProperty("y_shift")
    private Float yShift;
    @JsonProperty("scale")
    private Float scale;
}
