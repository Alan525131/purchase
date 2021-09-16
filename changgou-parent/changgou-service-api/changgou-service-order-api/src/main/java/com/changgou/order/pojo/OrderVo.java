package com.changgou.order.pojo;

/**
 * @author ljh
 * @version 1.0
 * @date 2021/1/12 12:10
 * @description 标题
 * @package com.changgou.order.pojo
 */
public class OrderVo extends Order {
    //1 普通 2  秒杀
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
