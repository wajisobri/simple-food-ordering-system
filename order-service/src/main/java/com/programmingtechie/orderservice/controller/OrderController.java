package com.programmingtechie.orderservice.controller;

import com.programmingtechie.orderservice.dto.OrderRequest;
import com.programmingtechie.orderservice.dto.OrderResponse;
import com.programmingtechie.orderservice.dto.OrdersResponse;
import com.programmingtechie.orderservice.model.Order;
import com.programmingtechie.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping(value="/order")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderResponse placeOrder(@RequestParam String username, @RequestParam String cafeId, @RequestBody OrderRequest orderRequest) {
        return orderService.placeOrder(username, cafeId, orderRequest);
    }

    @GetMapping(value="/orders")
    @ResponseStatus(HttpStatus.OK)
    public OrdersResponse getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping(value="/order")
    @ResponseStatus(HttpStatus.OK)
    public OrderResponse getOrderByOrderNumber(@RequestParam String orderNumber) {
        return orderService.getOrderByOrderNumber(orderNumber);
    }

//    @PutMapping(value="/order")
//    @ResponseStatus(HttpStatus.OK)
//    public Order changeStatusOrderByOrderNumber(@RequestParam String orderNumber) {
//        return orderService.changeStatusOrderByOrderNumber(orderNumber);
//    }
}
