package com.example.auth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.auth.common.CommonResult;
import com.example.auth.dao.UserDAO;
import com.example.auth.enums.ResultCodeEnums;
import com.example.auth.pojo.po.UserPO;
import com.example.auth.pojo.vo.UserVO;
import com.example.auth.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/11/06
 */
@Service
@Log4j2
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public CommonResult login(UserVO userVO) {

        if (!userVO.isLegalParams()){
            log.warn("params illegal, input params:{}",userVO);
            return CommonResult.failed(ResultCodeEnums.PARAMS_ILLEGAL.getCode(),ResultCodeEnums.PARAMS_ILLEGAL.getMsg());
        }

        QueryWrapper<UserPO> wrapper = null;
        UserPO  userPO = null;
        try {
            wrapper = new QueryWrapper<>();
            wrapper.eq("username",userVO.getUsername()).eq("password",userVO.getPassword());
            userPO = userDAO.selectOne(wrapper);
        } catch (Exception e) {
            log.error("selectOne on user is error:{}",e);
        }
        if (ObjectUtils.isEmpty(userPO)){
            log.warn("user not exist, input params:{}",userVO);
            return CommonResult.failed(ResultCodeEnums.USER_NOT_EXIST.getCode(),ResultCodeEnums.USER_NOT_EXIST.getMsg());
        }
        return CommonResult.ok(userPO);
    }
}
