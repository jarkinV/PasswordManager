package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChatPhotoDto {
    @JsonProperty("small_file_id")
    private String smallFileId;
    @JsonProperty("big_file_id")
    private String bigFileId;
}
