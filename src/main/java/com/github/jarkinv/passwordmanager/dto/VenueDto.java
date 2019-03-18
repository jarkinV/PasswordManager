package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VenueDto {
    @JsonProperty("location")
    private LocationDto location;
    @JsonProperty("title")
    private String title;
    @JsonProperty("address")
    private String address;
    @JsonProperty("foursquare_id")
    private String foursquareId;
}
