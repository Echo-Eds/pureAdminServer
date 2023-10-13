package com.li.Config;

/**
 * @Author: Li
 * @Description: 返回结果类
 * @Date: 2023/9/28 10:42
 * @Version: 1.0
 */
public class Result<T> {

    private String code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.setCode("200");
        result.setMsg("success");
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<T>(data);
        result.setCode("200");
        result.setMsg("success");
        return result;
    }

    public static <T> Result<T> error(String code,String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
