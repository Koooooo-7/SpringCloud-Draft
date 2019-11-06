package com.example.auth.service;

import com.example.auth.common.CommonResult;
import com.example.auth.pojo.vo.UserVO;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/11/06
 */
public interface UserService {


    CommonResult login(UserVO userVO);
}
