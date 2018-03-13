package com.gasyz.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by gaoang on 2018/2/27.
 */
@ControllerAdvice
public class GlobalExceptionHanlder {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Object businessException(BusinessException e) {
        return new ApiResponse(e.code,e.getMessage());
    }
}
