package com.alibaba.service.impl;

import com.alibaba.pojo.Iuser;
import com.alibaba.service.TestServiec;
import com.alibaba.service.mppaer.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作 者: 陆奉学
 * 工 程 名:  springboot-thymeleaf
 * 包    名:  com.alibaba.service.impl
 * 日    期:  2021-09-2021/9/9
 * 时    间:  23:50
 * 描    述:
 */
@Service
public class TestServiecImpl implements TestServiec {

    @Autowired
    private TestMapper testMapper;
    @Override
    public Iuser getUser(Integer id) {
        Iuser user = testMapper.getUserId(id);
        return user;
    }
}
