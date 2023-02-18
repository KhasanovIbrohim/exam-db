package com.example.examdatabase.service;
import com.example.examdatabase.entity.Category;
import com.example.examdatabase.payload.ResultMessage;

import java.util.List;

public interface CategoryService {
    ResultMessage add(Category category);
    Category show(Integer id);
    List<Category> showAll();
    ResultMessage edit(Integer id,Category category);
    ResultMessage delete(Integer id);
}
