package com.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 作 者: 陆奉学
 * 工 程 名:  springboot-thymeleaf
 * 包    名:  com.alibaba
 * 日    期:  2021-09-2021/9/9
 * 时    间:  23:28
 * 描    述:
 */
@EnableCaching
@SpringBootApplication
public class Day01Application {
    public static void main(String[] args) {
        SpringApplication.run(Day01Application.class, args);
    }
}
