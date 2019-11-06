package com.example.portal.pojo.vo;


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
public class UserVO {

    private int id;
    private String username;
    private String password;
    private Date createTime;
    private Date updateTime;

}
