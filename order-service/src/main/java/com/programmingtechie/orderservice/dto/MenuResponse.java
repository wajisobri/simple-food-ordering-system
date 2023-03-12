package com.programmingtechie.orderservice.dto;

import com.programmingtechie.orderservice.model.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MenuResponse {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private List<Ingredient> requiredIngredient;
}
