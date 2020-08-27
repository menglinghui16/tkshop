package com.tankehui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: menglh
 * @Description:
 * @Date: 2020/6/23 21:54
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        String name = "测试一下远程调试";
        String test = "test";
        System.out.println("name:"+name);
        System.out.println("test:"+test);

        return "hello word!";
    }
}
