package com.example.auth.web;

import com.example.auth.common.CommonResult;
import com.example.auth.pojo.vo.UserVO;
import com.example.auth.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/10/31
 */
@RestController
@RequestMapping("/auth")
@Log4j2
public class IndexController {


    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public CommonResult login(@RequestBody UserVO userVO){
        log.info("auth login userVO:{}",userVO);
        CommonResult result = userService.login(userVO);
        log.info("auth loin result response:{}",result);
        return result;
    }


}
