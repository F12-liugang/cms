package com.example.edu.cms.controller;

import com.example.edu.cms.model.Result.ResultMsg;
import com.example.edu.cms.model.Result.ResultUtil;
import com.example.edu.cms.model.TestDemoModel;
import com.example.edu.cms.server.TestDemoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping(value = "/add")
    @ResponseBody
    public ResultMsg<TestDemoModel> add(@RequestBody TestDemoModel user)  {
        TestDemoModel entity=new TestDemoModel();
        entity.setSysName(user.getSysName());
        entity.setCode(user.getCode());
        int res=testDemoServer.InsertUser(entity);
        int id=entity.getId();//得到插入的自增主键id
        if(id>0){
            return ResultUtil.successOk("添加成功");
        }else {
            return ResultUtil.error("添加失败");
        }
    }
}
