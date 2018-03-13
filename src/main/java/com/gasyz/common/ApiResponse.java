package com.gasyz.common;

/**
 * Created by gaoang on 2018/2/27.
 */
public class ApiResponse {

    private String code;
    private String msg;

    public ApiResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ApiResponse() {
    }

    public ApiResponse(BusinessException e) {
        this.code = this.code;
        this.msg = this.msg;
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
}
