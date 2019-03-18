package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AnimationDto {
    @JsonProperty("file_id")
    private String fileId;
    @JsonProperty("thumb")
    private PhotoSizeDto thumb;
    @JsonProperty("file_name")
    private String fileName;
    @JsonProperty("mime_type")
    private String mimeType;
    @JsonProperty("file_size")
    private Integer fileSize;
}
