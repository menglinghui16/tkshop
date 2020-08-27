package com.tankehui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

/**
 * @Author: menglh
 * @Description:测试远程测试，打包发布到服务器，然后在本地配置一下，在本地打断点进行测试
 * @Date: 2020/7/3 16:13
 */
@Controller
@RequestMapping("/testRemote")
public class TestRomote {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        String name = "测试一下远程调试";
        String test = "test";
        System.out.println("name:"+name);//远程代码调试，日志信息都会在服务器的控制台输出，sout语句也会输出；
        System.out.println("test:"+test);
        Logger.getLogger("TestRomote").info("name"+name+";test"+test);
        return "hello word!";
    }
}
