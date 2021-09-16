package com.changgou.pay.service;

import java.util.Map;

/**
 * @author ljh
 * @version 1.0
 * @date 2021/1/8 09:21
 * @description 标题
 * @package com.changgou.pay.service
 */
public interface WeixinPayService {

    Map<String, String> createNative(Map<String,String> parameter);

    Map<String, String> queryStatus(String out_trade_no);

}
