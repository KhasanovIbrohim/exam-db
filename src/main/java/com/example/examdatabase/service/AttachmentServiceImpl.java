package com.example.examdatabase.service;

import com.example.examdatabase.entity.Attachment;
import com.example.examdatabase.payload.ResultMessage;
import com.example.examdatabase.repository.AttachmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class AttachmentServiceImpl implements AttachmentService {
    final AttachmentRepository attachmentRepository;

    @Override
    public ResultMessage add(Attachment attachment) {
        return null;
    }

    @Override
    public Attachment show(Integer id) {
        return null;
    }

    @Override
    public List<Attachment> showAll() {
        return null;
    }

    @Override
    public ResultMessage edit(Integer id, Attachment attachment) {
        return null;
    }

    @Override
    public ResultMessage delete(Integer id) {
        return null;
    }
}
