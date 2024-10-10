package com.deepblue;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(MyJsonService.class) // 表示只有指定的class在classpath上时才能被注册
@EnableConfigurationProperties(MyJsonProperties.class) // 激活@ConfigurationProperties
public class MyJsonConfiguration {


    private MyJsonProperties myJsonProperties;

    // 自动注入配置类
    public MyJsonConfiguration(MyJsonProperties myJsonProperties) {
        this.myJsonProperties = myJsonProperties;
    }

    @Bean
    @ConditionalOnMissingBean(MyJsonService.class)
    public MyJsonService myJsonService(){
        MyJsonService myJsonService=new MyJsonService();
        myJsonService.setPrefixName(myJsonProperties.getPrefixName());
        myJsonService.setSuffixName(myJsonProperties.getSuffixName());
        return myJsonService;
    }



}
