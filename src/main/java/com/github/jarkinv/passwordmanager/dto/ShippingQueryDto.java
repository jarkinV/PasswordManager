package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ShippingQueryDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty("from")
    private UserDto from;
    @JsonProperty("invoice_payload")
    private String invoicePayload;
    @JsonProperty("shipping_address")
    private ShippingAddressDto shippingAddress;
}
