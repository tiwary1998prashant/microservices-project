package com.jitlabs.productservice.service;

import com.jitlabs.productservice.dto.ProductRequest;
import com.jitlabs.productservice.dto.ProductResponse;
import com.jitlabs.productservice.entity.Product;
import com.jitlabs.productservice.mapper.ProductMapper;
import com.jitlabs.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    public ProductResponse create(ProductRequest req){
        log.info("Creating product: {}", req.getName());
        Product product = productMapper.toEntity(req);
        Product save = productRepository.save(product);
        return productMapper.toResponse(save);
    }
    public List<ProductResponse> getAll(){
        return productRepository.findAll().stream()
                .map(productMapper::toResponse)
                .toList();
    }
}
