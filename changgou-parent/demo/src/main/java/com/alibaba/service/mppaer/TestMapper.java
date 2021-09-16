package com.alibaba.service.mppaer;

import com.alibaba.pojo.Iuser;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;



/**
 * 作 者: 陆奉学
 * 工 程 名:  springboot-thymeleaf
 * 包    名:  com.alibaba.service.mppaer
 * 日    期:  2021-09-2021/9/9
 * 时    间:  23:59
 * 描    述:
 */
@Component
public class TestMapper {
    @Cacheable(cacheNames = "user",key = "myKeyGenerator")
    public Iuser getUserId(Integer id) {
        System.out.println("查询" + id + "号用户");

        return getUserById(id);
    }

    public Iuser getUserById(Integer id){
       if(id % 10 % 3 == 0){
           System.out.println("没有这个数据");
           return null;
       }
        Iuser iuser = new Iuser();
        return  iuser.id(id)
                .name("李四")
                .age(18)
                .sex("男");
    }
}
