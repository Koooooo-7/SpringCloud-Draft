package com.example.portal.service;

import com.example.portal.common.CommonResult;
import com.example.portal.pojo.vo.UserVO;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/11/06
 */
public interface UserService {
    CommonResult login(UserVO userVO);
}
