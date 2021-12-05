package com.example.edu.cms.server;

import com.example.edu.cms.api.TestDomeApi;
import com.example.edu.cms.mapper.TestDemoMapper;
import com.example.edu.cms.model.TestDemoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDemoServer implements TestDomeApi {
    @Autowired
    TestDemoMapper testDemoMapper;

    public List<TestDemoModel> SelectUser(){
        return testDemoMapper.SelectUser();
    }
}
