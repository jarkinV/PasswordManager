package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InvoiceDto {
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("start_parameter")
    private String startParameter;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("total_amount")
    private Integer totalAmount;
}
