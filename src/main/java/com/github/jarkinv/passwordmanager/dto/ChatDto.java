package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChatDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("username")
    private String username;
    @JsonProperty("title")
    private String title;
    @JsonProperty("all_members_are_administrators")
    private Boolean allMembersAreAdministrators;
    @JsonProperty("photo")
    private ChatPhotoDto photo;
    @JsonProperty("description")
    private String description;
    @JsonProperty("invite_link")
    private String invite_Link;
    @JsonProperty("pinned_message")
    private MessageDto pinnedMessage;
    @JsonProperty("sticker_set_name")
    private String stickerSetName;
    @JsonProperty("can_set_sticker_set")
    private Boolean canSetStickerSet;
}
