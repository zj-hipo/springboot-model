package com.zj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springboot
 * @description: 首页测试类Controller
 * @author: 张军
 * @create: 2020-04-30 18:01
 **/
@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return"SpringBoot你好！！！";
    }
}
