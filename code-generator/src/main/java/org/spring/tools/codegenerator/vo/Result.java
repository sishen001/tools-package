package org.spring.tools.codegenerator.vo;

import com.alibaba.fastjson.JSON;


public class Result<T> {

    private int    code;
    private String desc;
    private T      data;

    public static <T> Result<T> success(T data) {
        Result<T> rtn = new Result<T>();
        rtn.setCode(200);
        rtn.setData(data);
        return rtn;
    }

    public static <T> Result<T> fail(String desc) {
        return fail(desc, null);
    }

    public static <T> Result<T> fail(String desc, T data) {
        Result<T> rtn = new Result<T>();
        rtn.setCode(500);
        rtn.setDesc(desc);
        rtn.setData(data);
        return rtn;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return JSON.toJSONString(this);
    }

}