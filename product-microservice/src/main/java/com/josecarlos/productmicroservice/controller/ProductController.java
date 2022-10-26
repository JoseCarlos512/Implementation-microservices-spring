package com.josecarlos.productmicroservice.controller;

import com.josecarlos.productmicroservice.entity.ProductEntity;
import com.josecarlos.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAllProducts() {
        return ResponseEntity.status(HttpStatus.OK).body(productRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductEntity productEntity) {
        productRepository.save(productEntity);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
