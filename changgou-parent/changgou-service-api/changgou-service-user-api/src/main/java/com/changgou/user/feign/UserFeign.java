package com.changgou.user.feign;

import com.changgou.user.pojo.User;
import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ljh
 * @version 1.0
 * @date 2021/1/5 10:18
 * @description 标题
 * @package com.changgou.user.feign
 */
@FeignClient(name="user",path = "/user")
public interface UserFeign {
    //根据用户名获取用户的信息
    @GetMapping("/load/{id}")
    Result<User> findById(@PathVariable(name="id") String id);

    /**
     * 给指定的用户名 添加积分
     * @param username  用户名
     * @param points  积分数
     * @return
     */
    @GetMapping("/points/add")
    public Result addPoints(@RequestParam(name="username") String username,
                            @RequestParam(name="points") Integer points);
}
