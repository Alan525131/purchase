package com.changgou.search.pojo;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/12/29 15:28
 * @description 标题
 * @package com.changgou.search.pojo
 */
public class LongToStringSerializer extends JsonSerializer<Long> {
    @Override
    public void serialize(Long value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        //自定义的序列化将long类型的数据 转成STRING 设置到JSON序列化器中
        gen.writeString(value.toString());
    }
}
