package com.example.deshdeal.service;

import com.example.deshdeal.model.Product;
import com.example.deshdeal.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct(){ return productRepository.findAll();}

}
