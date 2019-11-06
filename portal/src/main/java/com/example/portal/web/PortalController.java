package com.example.portal.web;

import com.example.portal.application.AuthFeignService;
import com.example.portal.common.CommonResult;
import com.example.portal.pojo.vo.Mt;
import com.example.portal.pojo.vo.UserVO;
import com.example.portal.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Map;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/10/31
 */
@RestController
@RequestMapping("/portal")
@Log4j2
public class PortalController {


    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public CommonResult  login(@RequestBody UserVO userVO){
        log.info("portal login params:{}",userVO);
        CommonResult commonResult = userService.login(userVO);
        log.info("portal login response:{}",commonResult);
        return commonResult;
    }

    @PostMapping("/mt")
    public void  login(@RequestBody Mt userVO){
        log.info("portal login params:{}",userVO);
    }
}
