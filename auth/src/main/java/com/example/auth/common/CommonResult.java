package com.example.auth.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/11/06
 */
@AllArgsConstructor
@Data
public class CommonResult<T> {

    private int code;
    private String msg;
    private T data;

    public static <T> CommonResult ok(T data){
        return new CommonResult<T>(0,"success",data);
    }

    public static <T> CommonResult failed(int code,String msg){
        return new CommonResult<T>(code ,msg,null);
    }
}
