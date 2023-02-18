package com.example.examdatabase.service;

import com.example.examdatabase.entity.Attachment;
import com.example.examdatabase.entity.Users;
import com.example.examdatabase.payload.ResultMessage;

import java.util.List;

public interface UserService {
    ResultMessage add(Users users);
    Users show(Integer id);
    List<Users> showAll();
    ResultMessage edit(Integer id,Users users);
    ResultMessage delete(Integer id);
}
