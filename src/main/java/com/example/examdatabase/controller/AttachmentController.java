package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Attachment;
import com.example.examdatabase.payload.ResultMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/attachment")
public interface AttachmentController {
    @PostMapping("/add")
    ResultMessage addAttachment(@RequestBody Attachment attachment);
    @PutMapping("/edit/{id}")
    ResultMessage editAttachment(@PathVariable Integer id, @RequestBody  Attachment attachment);
    @DeleteMapping("/delete/{id}")
    ResultMessage deleteAttachment(@PathVariable Integer id);
    @GetMapping("/show/{id}")
    Attachment showAttachment(@PathVariable Integer id);
    @GetMapping("/showAll/")
    List<Attachment> showAttachments();
}
