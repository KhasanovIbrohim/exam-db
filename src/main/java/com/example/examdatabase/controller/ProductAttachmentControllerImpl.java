package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Product_attachment;
import com.example.examdatabase.payload.ResultMessage;
import com.example.examdatabase.service.ProductAttachmentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class ProductAttachmentControllerImpl implements ProductAttachmentController{
    final ProductAttachmentServiceImpl productAttachmentService;
    @Override
    public ResultMessage addProduct_attachment(Product_attachment productAttachment) {
        return null;
    }

    @Override
    public ResultMessage editProduct_attachment(Integer id, Product_attachment productAttachment) {
        return null;
    }

    @Override
    public ResultMessage deleteProduct_attachment(Integer id) {
        return null;
    }

    @Override
    public Product_attachment showProduct_attachment(Integer id) {
        return null;
    }

    @Override
    public List<Product_attachment> showProduct_attachments() {
        return null;
    }
}
