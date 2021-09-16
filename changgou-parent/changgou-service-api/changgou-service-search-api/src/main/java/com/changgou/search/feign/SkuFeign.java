package com.changgou.search.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/30 11:23
 * @description 标题
 * @package com.changgou.search.feign
 */
@FeignClient(name="search",path = "/search")
public interface SkuFeign {
    //根据搜索条件 获取搜索的结果
    @PostMapping
    public Map<String,Object> search(@RequestBody(required = false) Map<String,String> searchMap);
}
