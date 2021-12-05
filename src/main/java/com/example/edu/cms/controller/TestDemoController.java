package com.example.edu.cms.controller;

import com.example.edu.cms.model.TestDemoModel;
import com.example.edu.cms.server.TestDemoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestDemoController {
    @Autowired
    TestDemoServer testDemoServer;

    @RequestMapping("/demo")
    public String SelectUser(Model model){
        //测试
        List<TestDemoModel> usermodel=testDemoServer.SelectUser();
        model.addAttribute("list", usermodel);
        return "demo/testDemo";
    }

    @RequestMapping("/demoList")
    @ResponseBody
    public List<TestDemoModel> SelectUserList(){
        List<TestDemoModel> usermodel=testDemoServer.SelectUser();
        return usermodel;
    }
}
