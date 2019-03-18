package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VideoNoteDto {
    @JsonProperty("file_id")
    private String fileId;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("thumb")
    private PhotoSizeDto thumb;
    @JsonProperty("file_size")
    private Integer fileSize;
}
