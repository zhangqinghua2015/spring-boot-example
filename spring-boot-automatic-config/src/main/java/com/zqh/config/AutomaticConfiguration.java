package com.zqh.config;

import com.zqh.properties.AutomaticConfigProperties;
import com.zqh.service.EchoService;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @discription:
 * @date: 2019/03/04 下午5:37
 */
@Configuration
@EnableConfigurationProperties(value = {AutomaticConfigProperties.class})
//@ConditionalOnClass(EchoService.class)
@ConditionalOnProperty(
        prefix = "automatic.config"
        /**需要匹配的参数名*/
        , name = "enable"
        /**需要匹配的参数值*/
        , havingValue = "true"
        /**匹配失败时是否启用*/
//        , matchIfMissing = true
)
public class AutomaticConfiguration {

    /*@Bean
    @ConditionalOnMissingBean(EchoService.class)
    public EchoService echoService(AutomaticConfigProperties properties) {
        EchoService echoService = new EchoService();
        echoService.setProperties(properties);
        return echoService;
    }*/

}
