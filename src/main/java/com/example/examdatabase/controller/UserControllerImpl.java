package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Users;
import com.example.examdatabase.payload.ResultMessage;
import com.example.examdatabase.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController{
    final UserServiceImpl userService;

    @Override
    public ResultMessage addUsers(Users users) {
        return null;
    }

    @Override
    public ResultMessage editUsers(Integer id, Users users) {
        return null;
    }

    @Override
    public ResultMessage deleteUsers(Integer id) {
        return null;
    }

    @Override
    public Users showUsers(Integer id) {
        return null;
    }

    @Override
    public List<Users> showAllUsers() {
        return null;
    }
}
