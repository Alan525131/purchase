package com.changgou.order.service;

import com.changgou.order.pojo.OrderItem;

import java.util.List;

/**
 * @author ljh
 * @version 1.0
 * @date 2021/1/5 12:02
 * @description 标题
 * @package com.changgou.order.service
 */
public interface CartService {
    //添加购物车 给指定的用户添加指定的商品以及数量到购物车中
    void add(Integer num, Long id, String username);

    List<OrderItem> list(String username);
}
