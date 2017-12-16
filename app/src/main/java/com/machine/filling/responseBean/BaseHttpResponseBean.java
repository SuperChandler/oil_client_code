package com.machine.filling.responseBean;

/**
 * Created by LENOVO on 2017/12/16.
 * http接口返回基础类
 */

public class BaseHttpResponseBean {
    private String msg;//返回信息，成功返回“操作成功”，失败返回错误信息
    private int code;//0000代表操作成功
    private Object result;//返回数据

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
