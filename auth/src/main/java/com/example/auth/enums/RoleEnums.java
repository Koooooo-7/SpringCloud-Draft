package com.example.auth.enums;

import lombok.Data;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/11/06
 */

public enum  RoleEnums {

    ADMIN("管理员"),USER("用户");
    private String desc;

    RoleEnums(String desc) {
        this.desc = desc;
    }

}
