package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Products;
import com.example.examdatabase.payload.ResultMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
public interface ProductsController {
    @PostMapping("/add")
    ResultMessage addProducts(@RequestBody Products products);
    @PutMapping("/edit/{id}")
    ResultMessage editProducts(@PathVariable Integer id, @RequestBody Products products);
    @DeleteMapping("/delete/{id}")
    ResultMessage deleteProducts(@PathVariable Integer id);
    @GetMapping("/show/{id}")
    Products showProducts(@PathVariable Integer id);
    @GetMapping("/showAll/")
    List<Products> showAllProducts();
}
