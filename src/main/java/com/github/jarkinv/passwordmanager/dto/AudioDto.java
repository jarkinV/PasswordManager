package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AudioDto {
    @JsonProperty("file_id")
    private String fileId;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("performer")
    private String performer;
    @JsonProperty("title")
    private String title;
    @JsonProperty("mime_type")
    private String mimeType;
    @JsonProperty("file_size")
    private Integer fileSize;
}
