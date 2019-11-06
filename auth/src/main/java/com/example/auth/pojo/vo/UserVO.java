package com.example.auth.pojo.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.auth.enums.RoleEnums;
import lombok.Data;
import lombok.ToString;
import org.apache.commons.lang.StringUtils;

import java.util.Date;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/11/06
 */

@Data
@ToString
@TableName("mt_user")
public class UserVO {

    private int id;
    private String username;
    private String password;
    private Date createTime;
    private Date updateTime;
    private RoleEnums role;

    public boolean isLegalParams(){
        return StringUtils.isNotEmpty(username)&&StringUtils.isNotEmpty(password);
    }
}
