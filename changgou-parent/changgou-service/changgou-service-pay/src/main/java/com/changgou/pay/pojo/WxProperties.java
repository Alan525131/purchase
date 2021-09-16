package com.changgou.pay.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ljh
 * @version 1.0
 * @date 2021/1/12 14:52
 * @description 标题
 * @package com.changgou.pay.pojo
 */

@Component
//@ConfigurationProperties(prefix = "")
public class WxProperties {

    private String seckillorder;
    private String seckillkey;

    public String getSeckillorder() {
        return seckillorder;
    }

    public void setSeckillorder(String seckillorder) {
        this.seckillorder = seckillorder;
    }

    public String getSeckillkey() {
        return seckillkey;
    }

    public void setSeckillkey(String seckillkey) {
        this.seckillkey = seckillkey;
    }
}
