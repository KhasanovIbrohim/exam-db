package com.example.examdatabase.service;

import com.example.examdatabase.payload.ResultMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class ProductAttachmentServiceImpl implements ProductAttachmentService {
    @Override
    public ResultMessage add(ProductAttachmentService attachment) {
        return null;
    }

    @Override
    public ProductAttachmentService show(Integer id) {
        return null;
    }

    @Override
    public List<ProductAttachmentService> showAll() {
        return null;
    }

    @Override
    public ResultMessage edit(Integer id, ProductAttachmentService attachment) {
        return null;
    }

    @Override
    public ResultMessage delete(Integer id) {
        return null;
    }
}
