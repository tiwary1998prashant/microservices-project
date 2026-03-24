package com.jitlabs.productservice.mapper;

import com.jitlabs.productservice.dto.ProductRequest;
import com.jitlabs.productservice.dto.ProductResponse;
import com.jitlabs.productservice.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toEntity(ProductRequest req){
        return Product.builder()
                .name(req.getName())
                .description(req.getDescription())
                .price(req.getPrice())
                .category(req.getCategory())
                .build();
    }
    public ProductResponse toResponse(Product p) {
        return ProductResponse.builder()
                .id(p.getId())
                .name(p.getName())
                .price(p.getPrice())
                .build();
    }

}
