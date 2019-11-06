package com.example.portal.application;

import com.example.portal.common.CommonResult;
import com.example.portal.pojo.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Description
 * @Auther Koy  https://github.com/Koooooo-7
 * @Date 2019/10/31
 */
@FeignClient(name= "AUTH")
public interface AuthFeignService {
    @PostMapping("/auth/login")
    public CommonResult login(UserVO userVO);


}
