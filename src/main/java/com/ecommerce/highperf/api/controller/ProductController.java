package com.ecommerce.highperf.api.controller;

import com.ecommerce.highperf.domain.model.Product;
import com.ecommerce.highperf.domain.service.ProductService;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @GetMapping
    public List<Product> list() { return service.findAll(); }

    @GetMapping("/{id}")
    public Product get(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    public Product create(@RequestBody Product product) { return service.save(product); }
}
