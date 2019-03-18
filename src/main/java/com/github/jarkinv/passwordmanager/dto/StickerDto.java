package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StickerDto {
    @JsonProperty("file_id")
    private String fileId;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("thumb")
    private PhotoSizeDto thumb;
    @JsonProperty("emoji")
    private String emoji;
    @JsonProperty("set_name")
    private String setName;
    @JsonProperty("mask_position")
    private MaskPositionDto maskPosition;
    @JsonProperty("file_size")
    private Integer fileSize;
}
