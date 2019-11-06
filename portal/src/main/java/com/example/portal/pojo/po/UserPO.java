package com.example.portal.pojo.po;

import lombok.Data;
import lombok.ToString;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/11/06
 */
@Data
@ToString
public class UserPO {

    private int id;
    private String username;
    private String password;
    private Data createTime;
    private Data updateTime;
}
