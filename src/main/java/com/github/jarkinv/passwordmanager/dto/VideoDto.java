package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VideoDto {
    @JsonProperty("file_id")
    private String fileId;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("thumb")
    private PhotoSizeDto thumb;
    @JsonProperty("mime_type")
    private String mimeType;
    @JsonProperty("file_size")
    private Integer fileSize;
}
