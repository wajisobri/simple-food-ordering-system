package com.programming.wajisobri.paymentservice.controller;

import com.programming.wajisobri.paymentservice.dto.PaymentResponse;
import com.programming.wajisobri.paymentservice.config.RabbitMQConfig;
import com.programming.wajisobri.paymentservice.dto.PaymentsResponse;
import com.programming.wajisobri.paymentservice.model.OrderEvent;
import com.programming.wajisobri.paymentservice.dto.PaymentRequest;
import com.programming.wajisobri.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class PaymentController {
    private final PaymentService paymentService;

    @RabbitListener(queues = RabbitMQConfig.ORDER_QUEUE_NAME)
    public void receivePaymentRequest(OrderEvent orderEvent) {
        paymentService.receivePaymentRequest(orderEvent);
    }

    @PostMapping(value="/payment")
    @ResponseStatus(HttpStatus.OK)
    public PaymentResponse payInvoice(@RequestBody PaymentRequest paymentRequest) {
        return paymentService.payInvoice(paymentRequest);
    }

    @GetMapping(value="/payments")
    @ResponseStatus(HttpStatus.OK)
    public PaymentsResponse getAllPayment() {
        return paymentService.getAllPayment();
    }

    @GetMapping(value="/payment/{paymentNumber}")
    @ResponseStatus(HttpStatus.OK)
    public PaymentResponse getAllNotificationByUsername(@PathVariable String paymentNumber) {
        return paymentService.getPaymentByPaymentNumber(paymentNumber);
    }
}
