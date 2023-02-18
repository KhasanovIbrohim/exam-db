package com.example.examdatabase.service;
import com.example.examdatabase.entity.Currency;
import com.example.examdatabase.payload.ResultMessage;

import java.util.List;

public interface CurrencyService {
    ResultMessage add(Currency currency);
    Currency show(Integer id);
    List<Currency> showAll();
    ResultMessage edit(Integer id,Currency currency);
    ResultMessage delete(Integer id);
}
