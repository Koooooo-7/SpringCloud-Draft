package com.example.auth.pojo.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.auth.enums.RoleEnums;
import lombok.Data;
import lombok.ToString;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/11/06
 */
@Data
@ToString
@TableName("mt_user")
public class UserPO {

    private int id;
    private String username;
    private String password;
    private Data createTime;
    private Data updateTime;
    private RoleEnums role;
}
