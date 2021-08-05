package com.example.productrest.controllers;

import com.example.productrest.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @GetMapping
    public ResponseEntity<List<Product>> getProduct() {
        List<Product> products= Arrays.asList(new Product(1L,"Banana", BigDecimal.ONE),
                new Product(2L,"Banana", BigDecimal.ONE),
                new Product(3L,"Banana", BigDecimal.ONE));
        

        return ResponseEntity.ok().body(products);
    }
}
