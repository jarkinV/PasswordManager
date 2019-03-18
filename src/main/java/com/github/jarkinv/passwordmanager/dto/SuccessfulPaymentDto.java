package com.github.jarkinv.passwordmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SuccessfulPaymentDto {
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("total_amount")
    private Integer totalAmount;
    @JsonProperty("invoice_payload")
    private String invoicePayload;
    @JsonProperty("shipping_option_id")
    private String shippingOptionId;
    @JsonProperty("order_info")
    private OrderInfoDto orderInfo;
    @JsonProperty("telegram_payment_charge_id")
    private String telegramPaymentChargeId;
    @JsonProperty("provider_payment_charge_id")
    private String providerPaymentChargeId;
}
