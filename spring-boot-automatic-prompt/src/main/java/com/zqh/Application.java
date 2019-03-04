package com.zqh;

import com.zqh.config.BootProperties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @discription:
 * @date: 2019/03/04 下午4:48
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        BeanFactory beanFactory = SpringApplication.run(Application.class, args).getBeanFactory();
        System.out.println(beanFactory.getBean(BootProperties.class));
    }

}
