package com.alibaba.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 作 者: 陆奉学
 * 工 程 名:  springboot-thymeleaf
 * 包    名:  com.alibaba
 * 日    期:  2021-09-2021/9/9
 * 时    间:  23:27
 * 描    述:
 */

// 自定义配置类配置keyGenerator
@Configuration
public class MycacheConfig {
    @Bean("myKeyGenerator")
    public KeyGenerator keyGenerator() {
        return new KeyGenerator() {

            @Override
            public Object generate(Object target, Method method, Object... params) {
                return method.getName() + "[" + Arrays.asList(params).toString() + "]";
            }
        };
    }
}
