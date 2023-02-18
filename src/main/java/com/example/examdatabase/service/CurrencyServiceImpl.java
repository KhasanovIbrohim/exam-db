package com.example.examdatabase.service;

import com.example.examdatabase.entity.Currency;
import com.example.examdatabase.payload.ResultMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class CurrencyServiceImpl implements CurrencyService {
    @Override
    public ResultMessage add(Currency currency) {
        return null;
    }

    @Override
    public Currency show(Integer id) {
        return null;
    }

    @Override
    public List<Currency> showAll() {
        return null;
    }

    @Override
    public ResultMessage edit(Integer id, Currency currency) {
        return null;
    }

    @Override
    public ResultMessage delete(Integer id) {
        return null;
    }
}
