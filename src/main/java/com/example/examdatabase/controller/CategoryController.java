package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Category;
import com.example.examdatabase.payload.ResultMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/category")
public interface CategoryController {
    @PostMapping("/add")
    ResultMessage addCategory(@RequestBody Category category);
    @PutMapping("/edit/{id}")
    ResultMessage editCategory(@PathVariable Integer id, @RequestBody Category category);
    @DeleteMapping("/delete/{id}")
    ResultMessage deleteCategory(@PathVariable Integer id);
    @GetMapping("/show/{id}")
    Category showCategory(@PathVariable Integer id);
    @GetMapping("/showAll/")
    List<Category> showCategorys();
}
