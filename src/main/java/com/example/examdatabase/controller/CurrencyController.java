package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Currency;
import com.example.examdatabase.payload.ResultMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/currency")
public interface CurrencyController {
    @PostMapping("/add")
    ResultMessage addCurrency(@RequestBody Currency currency);
    @PutMapping("/edit/{id}")
    ResultMessage editCurrency(@PathVariable Integer id, @RequestBody Currency currency);
    @DeleteMapping("/delete/{id}")
    ResultMessage deleteCurrency(@PathVariable Integer id);
    @GetMapping("/show/{id}")
    Currency showCurrency(@PathVariable Integer id);
    @GetMapping("/showAll/")
    List<Currency> showCurrencys();
}
