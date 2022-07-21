package com.example.project.repository;

import com.example.project.product.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Test
    void test(){
            Product product = new Product();
            product.setName("연ㅍㄹ");
            product.setPrice(2000);
            product.setStock(100);

            productRepository.save(product);

            Product productOptional= productRepository.findById(1L).get();
        System.out.println(productOptional);
    }
}