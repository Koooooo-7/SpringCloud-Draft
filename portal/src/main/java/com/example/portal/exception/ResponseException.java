package com.example.portal.exception;

import com.example.portal.common.CommonResult;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.annotation.Annotation;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/11/06
 */
@RestControllerAdvice
public class ResponseException  {

    @ExceptionHandler(Exception.class)
    public CommonResult allException(Exception e){
        System.out.println("Exception Handler:"+e.getMessage());
        return CommonResult.failed(50000,"非法请求");
    }
}
