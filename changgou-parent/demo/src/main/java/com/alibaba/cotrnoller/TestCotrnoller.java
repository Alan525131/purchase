package com.alibaba.cotrnoller;

import com.alibaba.pojo.Iuser;
import com.alibaba.service.TestServiec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作 者: 陆奉学
 * 工 程 名:  springboot-thymeleaf
 * 包    名:  com.alibaba.cotrnoller
 * 日    期:  2021-09-2021/9/9
 * 时    间:  23:39
 * 描    述:
 */
@RestController
public class TestCotrnoller {


    @Autowired
    private TestServiec testService;
    @GetMapping("/t/{id}")
    public void test(@PathVariable(value = "id") Integer id){
       Iuser user = testService.getUser(id);
        System.out.println(user);
    }

}
