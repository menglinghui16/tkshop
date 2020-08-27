package com.tankehui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: menglh
 * @Description:
 * @Date: 2020/7/8 11:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    //在单元测试中，进行controller层url请求的测试；
    @Test
    public void exampleTest() {
        String body = this.restTemplate.getForObject("/test/hello", String
                .class);
        System.out.println(body);
    }





}
