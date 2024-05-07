package com.ilmsg.eurekaclientstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ilmsg.eurekaclientstore.consumers.ProductConsumer;
import com.ilmsg.eurekaclientstore.entities.Product;

@RequestMapping("/stores")
@RestController
public class StoreController {
    @Autowired
    private ProductConsumer productConsumer;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products = productConsumer.getProducts();
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

    // @GetMapping("/products")
    // public List<Product> getProducts() {
    // List<Product> products = productConsumer.getProducts();
    // return products;
    // }
}