package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Category;
import com.example.examdatabase.payload.ResultMessage;
import com.example.examdatabase.service.CategoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class CategoryControllerImpl implements CategoryController{
    final CategoryServiceImpl categoryService;
    @Override
    public ResultMessage addCategory(Category category) {
        return null;
    }

    @Override
    public ResultMessage editCategory(Integer id, Category category) {
        return null;
    }

    @Override
    public ResultMessage deleteCategory(Integer id) {
        return null;
    }

    @Override
    public Category showCategory(Integer id) {
        return null;
    }

    @Override
    public List<Category> showCategorys() {
        return null;
    }
}
