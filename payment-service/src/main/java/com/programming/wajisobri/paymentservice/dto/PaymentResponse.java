package com.programming.wajisobri.paymentservice.dto;

import com.programming.wajisobri.paymentservice.model.Payment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponse {
    private Integer code;
    private String message;
    private Payment data;
}
