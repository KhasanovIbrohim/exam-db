package com.example.examdatabase.service;

import com.example.examdatabase.entity.Attachment;
import com.example.examdatabase.payload.ResultMessage;

import java.util.List;

public interface AttachmentService {
    ResultMessage add(Attachment attachment);
    Attachment show(Integer id);
    List<Attachment> showAll();
    ResultMessage edit(Integer id,Attachment attachment);
    ResultMessage delete(Integer id);
}
