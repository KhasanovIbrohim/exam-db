package com.example.examdatabase.service;
import com.example.examdatabase.payload.ResultMessage;

import java.util.List;

public interface ProductAttachmentService {
    ResultMessage add(ProductAttachmentService attachment);
    ProductAttachmentService show(Integer id);
    List<ProductAttachmentService> showAll();
    ResultMessage edit(Integer id,ProductAttachmentService attachment);
    ResultMessage delete(Integer id);
}
