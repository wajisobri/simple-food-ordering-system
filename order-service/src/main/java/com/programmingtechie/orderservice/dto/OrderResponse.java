package com.programmingtechie.orderservice.dto;

import com.programmingtechie.orderservice.model.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {
    private Integer code;
    private String message;
    private Order data;
}
