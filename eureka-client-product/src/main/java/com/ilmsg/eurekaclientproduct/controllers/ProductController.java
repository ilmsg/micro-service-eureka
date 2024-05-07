package com.ilmsg.eurekaclientproduct.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ilmsg.eurekaclientproduct.entities.Product;
import com.ilmsg.eurekaclientproduct.entities.ProductList;

@RequestMapping("/products")
@RestController
public class ProductController {
    @GetMapping()
    public ProductList getProduct() {
        List<Product> products = List.of(
                new Product(1L, "product 1"),
                new Product(2L, "product 2"));

        return new ProductList(products);
    }

    // @GetMapping()
    // public ResponseEntity<List<Product>> getProduct() {
    // List<Product> products = List.of(
    // new Product(1L, "product 1"),
    // new Product(2L, "product 2"));

    // return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    // }
}
