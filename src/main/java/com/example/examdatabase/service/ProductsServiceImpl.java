package com.example.examdatabase.service;

import com.example.examdatabase.entity.Products;
import com.example.examdatabase.payload.ResultMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class ProductsServiceImpl implements ProductsService{
    @Override
    public ResultMessage add(Products products) {
        return null;
    }

    @Override
    public Products show(Integer id) {
        return null;
    }

    @Override
    public List<Products> showAll() {
        return null;
    }

    @Override
    public ResultMessage edit(Integer id, Products products) {
        return null;
    }

    @Override
    public ResultMessage delete(Integer id) {
        return null;
    }
}
