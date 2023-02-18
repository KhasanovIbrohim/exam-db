package com.example.examdatabase.service;
import com.example.examdatabase.entity.Products;
import com.example.examdatabase.payload.ResultMessage;

import java.util.List;

public interface ProductsService {
    ResultMessage add(Products products);
    Products show(Integer id);
    List<Products> showAll();
    ResultMessage edit(Integer id,Products products);
    ResultMessage delete(Integer id);
}
