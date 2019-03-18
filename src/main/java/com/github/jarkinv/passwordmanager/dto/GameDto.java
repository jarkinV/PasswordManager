package com.github.jarkinv.passwordmanager.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GameDto {
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("photo")
    private List<PhotoSizeDto> photo;
    @JsonProperty("text")
    private String text;
    @JsonProperty("text_entities")
    private List<MessageEntityDto> textEntities;
    @JsonProperty("animation")
    private AnimationDto animation;
}
