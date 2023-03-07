package com.programmingtechie.productservice.dto;

import com.programmingtechie.productservice.model.Menu;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MenusResponse {
    private Integer code;
    private String message;
    private List<Menu> data;
}
