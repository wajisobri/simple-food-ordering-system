package com.programming.wajisobri.orderservice.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.HashMap;

@Document(collection = "order_events")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@ToString
public class OrderEvent {
    public enum EventType {
        Order_Created, Order_Unpaid, Order_Paid, Order_Preparing, Order_Delivering, Order_Finished, Order_Cancelled
    }

    @Id
    private String eventId;
    private EventType eventType;
    private HashMap<String, Object> eventData = new HashMap<>();
    private LocalDateTime eventTime;
}
