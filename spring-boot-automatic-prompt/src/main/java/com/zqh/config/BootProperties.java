package com.zqh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * @discription:
 * @date: 2019/03/04 下午4:37
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "boot.properties")
public class BootProperties {

    private String name;

    private Integer value;
    
}
