package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Users;
import com.example.examdatabase.payload.ResultMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
public interface UserController {
    @PostMapping("/signUp")
    ResultMessage addUsers(@RequestBody Users users);
    @PutMapping("/edit/{id}")
    ResultMessage editUsers(@PathVariable Integer id, @RequestBody Users users);
    @DeleteMapping("/delete/{id}")
    ResultMessage deleteUsers(@PathVariable Integer id);
    @GetMapping("/show/{id}")
    Users showUsers(@PathVariable Integer id);
    @GetMapping("/showAll/")
    List<Users> showAllUsers();
}
