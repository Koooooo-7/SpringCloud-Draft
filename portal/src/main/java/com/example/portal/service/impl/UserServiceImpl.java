package com.example.portal.service.impl;

import com.example.portal.application.AuthFeignService;
import com.example.portal.common.CommonResult;
import com.example.portal.pojo.vo.UserVO;
import com.example.portal.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.bouncycastle.pqc.math.linearalgebra.IntUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/11/06
 */
@Service
@Log4j2
public class UserServiceImpl implements UserService {

    @Autowired
    AuthFeignService authFeignService;

    public CommonResult login(UserVO userVO){
        CommonResult result = authFeignService.login(userVO);
        log.info("portal feign auth login result:{}",result);
        // 如果用户登录成功
//        if (0 == result.getCode()){
//            Object data = result.getData();
//        }
        return result;
    }
}
