package com.programming.wajisobri.cafeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CafeIngredientRequest {
    IngredientNoCafeRequest ingredientNoCafeRequest;
}
