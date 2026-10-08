package com.example.product_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    // Tiêm ProductService qua @Autowired (Dependency Injection)
    @Autowired
    private ProductService productService;

}