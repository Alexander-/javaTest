package com.example.demo.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestingService
{
    @Autowired
    TestingRepository testingRepository;

    public List<TestingEntity> getTestingObjects()
    {
        List<TestingEntity> testingEntityList = testingRepository.findAll();

        return testingEntityList;
    }
}
