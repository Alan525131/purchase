package com.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/22 11:17
 * @description 标题
 * @package com.changgou
 */
@SpringBootApplication
@EnableEurekaServer//开启eureka服务端
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
