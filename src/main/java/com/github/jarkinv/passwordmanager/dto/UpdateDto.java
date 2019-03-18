package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UpdateDto {
    @JsonProperty("update_id")
    private String updateId;
    @JsonProperty("message")
    private MessageDto message;
    @JsonProperty("edited_message")
    private MessageDto editedMessage;
    @JsonProperty("channel_post")
    private MessageDto channelPost;
    @JsonProperty("edited_channel_post")
    private MessageDto editedChannelPost;
    @JsonProperty("inline_query")
    private InlineQueryDto inlineQuery;
    @JsonProperty("chosen_inline_result")
    private ChosenInlineResultDto chosenInlineResult;
    @JsonProperty("callback_query")
    private CallbackQueryDto callbackQuery;
    @JsonProperty("shipping_query")
    private ShippingQueryDto shippingQuery;
    @JsonProperty("pre_checkout_query")
    private PreCheckoutQueryDto preCheckoutQuery;
}
