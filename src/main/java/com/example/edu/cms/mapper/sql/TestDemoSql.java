package com.example.edu.cms.mapper.sql;

import com.example.edu.cms.model.TestDemoModel;

public class TestDemoSql {
    public String selectUser(){
        return "select id,code,sys_name from sys_user";
    }

    public String InsertUser(TestDemoModel model){
        return "insert into sys_user(code,sys_name) values(#{code},#{sysName})";
    }
}
