package com.zqh.test;

import com.zqh.properties.AutomaticConfigProperties;
import com.zqh.service.EchoService;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @discription:
 * @date: 2019/03/04 下午6:24
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        BeanFactory beanFactory = SpringApplication.run(Application.class, args).getBeanFactory();
        System.out.println(beanFactory.getBean(AutomaticConfigProperties.class));
        EchoService echoService = beanFactory.getBean(EchoService.class);
        echoService.echoProperties();
    }

}
