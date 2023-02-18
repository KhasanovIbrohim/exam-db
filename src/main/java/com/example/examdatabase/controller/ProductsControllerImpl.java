package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Products;
import com.example.examdatabase.payload.ResultMessage;
import com.example.examdatabase.service.ProductsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class ProductsControllerImpl implements ProductsController{
    final ProductsServiceImpl productsService;
    @Override
    public ResultMessage addProducts(Products products) {
        return null;
    }

    @Override
    public ResultMessage editProducts(Integer id, Products products) {
        return null;
    }

    @Override
    public ResultMessage deleteProducts(Integer id) {
        return null;
    }

    @Override
    public Products showProducts(Integer id) {
        return null;
    }

    @Override
    public List<Products> showAllProducts() {
        return null;
    }
}
