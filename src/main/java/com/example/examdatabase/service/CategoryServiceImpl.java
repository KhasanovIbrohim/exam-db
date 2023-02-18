package com.example.examdatabase.service;

import com.example.examdatabase.entity.Category;
import com.example.examdatabase.payload.ResultMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public ResultMessage add(Category category) {
        return null;
    }

    @Override
    public Category show(Integer id) {
        return null;
    }

    @Override
    public List<Category> showAll() {
        return null;
    }

    @Override
    public ResultMessage edit(Integer id, Category category) {
        return null;
    }

    @Override
    public ResultMessage delete(Integer id) {
        return null;
    }
}
