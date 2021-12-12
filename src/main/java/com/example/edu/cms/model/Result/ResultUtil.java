package com.example.edu.cms.model.Result;

public class ResultUtil {
    //成功
    public static ResultMsg success(Object object) {
        ResultMsg result = new ResultMsg();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    public static ResultMsg successOk(String msg) {
        ResultMsg result = new ResultMsg();
        result.setCode(200);
        result.setMsg(msg);
        return result;
    }

    //失败
    public static ResultMsg error(String msg) {
        ResultMsg result = new ResultMsg();
        result.setCode(500);
        result.setMsg(msg);
        return result;
    }
}
