package com.example.product_management;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1L, "Bàn phím cơ", 1200000.0));
        products.add(new Product(2L, "Chuột không dây", 450000.0));
        products.add(new Product(3L, "Tai nghe Gaming", 850000.0));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}