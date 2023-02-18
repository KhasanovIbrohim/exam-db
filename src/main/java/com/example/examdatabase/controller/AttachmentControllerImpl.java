package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Attachment;
import com.example.examdatabase.payload.ResultMessage;
import com.example.examdatabase.service.AttachmentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class AttachmentControllerImpl implements AttachmentController{
    final AttachmentServiceImpl attachmentService;
    @Override
    public ResultMessage addAttachment(Attachment attachment) {
        return null;
    }

    @Override
    public ResultMessage editAttachment(Integer id, Attachment attachment) {
        return null;
    }

    @Override
    public ResultMessage deleteAttachment(Integer id) {
        return null;
    }

    @Override
    public Attachment showAttachment(Integer id) {
        return null;
    }

    @Override
    public List<Attachment> showAttachments() {
        return null;
    }
}
