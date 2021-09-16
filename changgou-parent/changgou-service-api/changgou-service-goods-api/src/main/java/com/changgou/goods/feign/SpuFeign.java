package com.changgou.goods.feign;

import com.changgou.goods.pojo.Sku;
import com.changgou.goods.pojo.Spu;
import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ljh
 * @version 1.0
 * @date 2021/1/5 14:45
 * @description 标题
 * @package com.changgou.goods.feign
 */
@FeignClient(name="goods",path = "/spu")
public interface SpuFeign {
    /**
     * 根据spu的ID 获取spu的数据
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public Result<Spu> findById(@PathVariable(value = "id") Long id);
}
