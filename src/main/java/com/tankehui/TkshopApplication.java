package com.tankehui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class TkshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkshopApplication.class, args);
    }

}
