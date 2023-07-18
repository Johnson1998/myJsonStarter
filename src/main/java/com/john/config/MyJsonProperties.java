package com.john.config;

import lombok.Data;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: John
 * @Date: 2023/07/18/21:47
 * @Description:
 */
@Data
@ConfigurationProperties(prefix = "nobody.json")
public class MyJsonProperties {

    public static final String DEFAULT_PREFIX_NAME = "@";

    public static final String DEFAULT_SUFFIX_NAME = "@";

    private String prefixName = DEFAULT_PREFIX_NAME;

    private String suffixName = DEFAULT_SUFFIX_NAME;


}
