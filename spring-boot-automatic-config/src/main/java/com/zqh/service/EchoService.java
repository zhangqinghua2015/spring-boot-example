package com.zqh.service;

import com.zqh.properties.AutomaticConfigProperties;

/**
 * @discription:
 * @date: 2019/03/04 下午5:30
 */
public class EchoService {

    private AutomaticConfigProperties properties;

    public void echoProperties() {
        System.out.println(properties);
    }

    public AutomaticConfigProperties getProperties() {
        return properties;
    }

    public void setProperties(AutomaticConfigProperties properties) {
        this.properties = properties;
    }
}
