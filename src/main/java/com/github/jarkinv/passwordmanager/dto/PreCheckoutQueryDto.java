package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PreCheckoutQueryDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty("from")
    private UserDto from;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("total_amount")
    private Integer total_amount;
    @JsonProperty("invoice_payload")
    private String invoice_payload;
    @JsonProperty("shipping_option_id")
    private String shipping_option_id;
    @JsonProperty("order_info")
    private OrderInfoDto order_info;
}
