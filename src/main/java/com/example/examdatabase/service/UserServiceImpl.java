package com.example.examdatabase.service;

import com.example.examdatabase.controller.UserController;
import com.example.examdatabase.entity.Users;
import com.example.examdatabase.payload.ResultMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class UserServiceImpl implements UserService {
    @Override
    public ResultMessage add(Users users) {
        return null;
    }

    @Override
    public Users show(Integer id) {
        return null;
    }

    @Override
    public List<Users> showAll() {
        return null;
    }

    @Override
    public ResultMessage edit(Integer id, Users users) {
        return null;
    }

    @Override
    public ResultMessage delete(Integer id) {
        return null;
    }
}
