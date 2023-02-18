package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Currency;
import com.example.examdatabase.payload.ResultMessage;
import com.example.examdatabase.service.CurrencyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class CurrencyControllerImpl implements CurrencyController{
    final CurrencyServiceImpl currencyService;
    @Override
    public ResultMessage addCurrency(Currency currency) {
        return null;
    }

    @Override
    public ResultMessage editCurrency(Integer id, Currency currency) {
        return null;
    }

    @Override
    public ResultMessage deleteCurrency(Integer id) {
        return null;
    }

    @Override
    public Currency showCurrency(Integer id) {
        return null;
    }

    @Override
    public List<Currency> showCurrencys() {
        return null;
    }
}
