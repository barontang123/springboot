package com.springboot.test.springbootweb.common;

public class Response<T> {
    /**
     * 结果对象
     */
    private T data;
    /**
     * 错误码
     */
    private String code;
    /**
     * 错误信息
     */
    private String message;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
