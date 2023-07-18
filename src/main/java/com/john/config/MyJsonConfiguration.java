package com.john.config;


import com.john.service.MyJsonService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: John
 * @Date: 2023/07/18/21:48
 * @Description:
 */
@Configuration
@ConditionalOnClass(MyJsonService.class)
@EnableConfigurationProperties(MyJsonProperties.class)
public class MyJsonConfiguration {

    private MyJsonProperties myJsonProperties;

    public MyJsonConfiguration(MyJsonProperties myJsonProperties) {
        this.myJsonProperties = myJsonProperties;
    }

    @Bean
    @ConditionalOnMissingBean(MyJsonService.class)
    public MyJsonService myJsonService() {
        MyJsonService myJsonService = new MyJsonService();
        myJsonService.setPrefixName(myJsonProperties.getPrefixName());
        myJsonService.setSuffixName(myJsonProperties.getSuffixName());
        return myJsonService;
    }
}
