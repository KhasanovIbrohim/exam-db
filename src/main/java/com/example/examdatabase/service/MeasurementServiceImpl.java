package com.example.examdatabase.service;

import com.example.examdatabase.entity.Measurement;
import com.example.examdatabase.payload.ResultMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class MeasurementServiceImpl implements MeasurementService {
    @Override
    public ResultMessage add(Measurement measurement) {
        return null;
    }

    @Override
    public Measurement show(Integer id) {
        return null;
    }

    @Override
    public List<Measurement> showAll() {
        return null;
    }

    @Override
    public ResultMessage edit(Integer id, Measurement measurement) {
        return null;
    }

    @Override
    public ResultMessage delete(Integer id) {
        return null;
    }
}
