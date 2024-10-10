package com.deepblue;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "nobody.json")
@Data
public class MyJsonProperties {

    public static final String DEFAULT_PREFIX_NAME = "@";

    // Starter使用者没在配置文件中配置suffixName属性的值时的默认值
    public static final String DEFAULT_SUFFIX_NAME = "@";

    private String prefixName = DEFAULT_PREFIX_NAME;

    private String suffixName = DEFAULT_SUFFIX_NAME;


}
