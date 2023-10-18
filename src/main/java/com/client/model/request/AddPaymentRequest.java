package com.client.model.request;

import lombok.Data;

@Data
public class AddPaymentRequest {
    private String reservation;
    private String amountPaid;
}
