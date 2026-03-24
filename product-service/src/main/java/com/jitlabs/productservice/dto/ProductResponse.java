package com.jitlabs.productservice.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder
public class ProductResponse {
    private UUID id;
    private String name;
    private BigDecimal price;
}
