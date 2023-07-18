package com.john.service;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: John
 * @Date: 2023/07/18/21:46
 * @Description:
 */
@Data
public class MyJsonService {

    private String prefixName;

    private String suffixName;

    /**
     * 将Java对象转为带有指定前后缀的Json字符串
     */

    public String objectToMyJson(Object o) {
        return prefixName + JSON.toJSONString(o) + suffixName;
    }

}
