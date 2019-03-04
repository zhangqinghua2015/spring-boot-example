package com.zqh.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * @discription:
 * @date: 2019/03/04 下午5:29
 */
@Data
@ConfigurationProperties(prefix = "automatic.config")
public class AutomaticConfigProperties {

    private String version;

    private Integer number;

}
