package com.github.jarkinv.passwordmanager.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MessageDto {
    @JsonProperty("message_id")
    private Integer messageId;
    @JsonProperty("from")
    private UserDto from;
    @JsonProperty("date")
    private Integer date;
    @JsonProperty("chat")
    private ChatDto chat;
    @JsonProperty("forward_from")
    private UserDto forwardFrom;
    @JsonProperty("forward_from_chat")
    private ChatDto forwardFromChat;
    @JsonProperty("forward_from_message_id")
    private Integer forwardFromMessageId;
    @JsonProperty("forward_signature")
    private String forwardSignature;
    @JsonProperty("forward_date")
    private Integer forwardDate;
    @JsonProperty("reply_to_message")
    private MessageDto replyToMessage;
    @JsonProperty("edit_date")
    private Integer editDate;
    @JsonProperty("media_group_id")
    private String mediaGroupId;
    @JsonProperty("author_signature")
    private String authorSignature;
    @JsonProperty("text")
    private String text;
    @JsonProperty("entities")
    private List<MessageEntityDto> entities;
    @JsonProperty("caption_entities")
    private List<MessageEntityDto> captionEntities;
    @JsonProperty("audio")
    private AudioDto audio;
    @JsonProperty("document")
    private DocumentDto document;
    @JsonProperty("game")
    private GameDto game;
    @JsonProperty("photo")
    private List<PhotoSizeDto> photo;
    @JsonProperty("sticker")
    private StickerDto sticker;
    @JsonProperty("video")
    private VideoDto video;
    @JsonProperty("voice")
    private VoiceDto voice;
    @JsonProperty("video_note")
    private VideoNoteDto videoNote;
    @JsonProperty("caption")
    private String caption;
    @JsonProperty("contact")
    private ContactDto contact;
    @JsonProperty("location")
    private LocationDto location;
    @JsonProperty("venue")
    private VenueDto venue;
    @JsonProperty("new_chat_member")
    private UserDto newChatMember;
    @JsonProperty("new_chat_members")
    private List<UserDto> newChatMembers;
    @JsonProperty("left_chat_member")
    private UserDto leftChatMember;
    @JsonProperty("new_chat_title")
    private String newChatTitle;
    @JsonProperty("new_chat_photo")
    private List<PhotoSizeDto> newChatPhoto;
    @JsonProperty("delete_chat_photo")
    private Boolean deleteChatPhoto;
    @JsonProperty("group_chat_created")
    private Boolean groupChatCreated;
    @JsonProperty("supergroup_chat_created")
    private Boolean superGroupChatCreated;
    @JsonProperty("channel_chat_created")
    private Boolean channelChatCreated;
    @JsonProperty("migrate_to_chat_id")
    private Long migrateToChatId;
    @JsonProperty("migrate_from_chat_id")
    private Long migrateFromChatId;
    @JsonProperty("pinned_message")
    private MessageDto pinnedMessage;
    @JsonProperty("invoice")
    private InvoiceDto invoice;
    @JsonProperty("successful_payment")
    private SuccessfulPaymentDto successfulPayment;
    @JsonProperty("connected_website")
    private String connectedWebsite;
}
