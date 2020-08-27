package com.tankehui;

import com.tankehui.controller.TestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * @Author: menglh
 * @Description:
 * @Date: 2020/7/8 15:27
 */

@RunWith(SpringRunner.class)
@WebMvcTest
//@WebMvcTest这个注解和@SpringBootTest、@AutoConfigureMockMvc这两个注解作用一致，都可以测试controller，注意不能同时使用
//@WebMvcTest(TestController.class)
//@WebMvcTest这个注解后边，可以指定测试哪个控制器
public class MockMvcTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getDispatchInfo() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/test/hello")
//                .param("page", "0")
//                .param("size", "20")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andDo(print());
        System.out.println("测试结束");
    }

}
