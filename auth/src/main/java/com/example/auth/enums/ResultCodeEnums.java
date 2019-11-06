package com.example.auth.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/11/06
 */
@AllArgsConstructor
@Getter
public enum  ResultCodeEnums {

    PARAMS_ILLEGAL(50001,"params illegal"),
    USER_NOT_EXIST(50002,"user_account_or_password_error");
    private int code;
    private String msg;

}
