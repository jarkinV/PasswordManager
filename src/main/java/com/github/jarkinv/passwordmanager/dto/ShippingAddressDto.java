package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ShippingAddressDto {
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("stateEnum")
    private String state;
    @JsonProperty("city")
    private String city;
    @JsonProperty("street_line1")
    private String streetLine1;
    @JsonProperty("street_line2")
    private String streetLine2;
    @JsonProperty("post_code")
    private String postCode;
}
