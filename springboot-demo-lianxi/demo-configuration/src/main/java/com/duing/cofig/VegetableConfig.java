package com.duing.cofig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration//@Configuration 申明这是配置类，在spring中可以替代XML
@ConfigurationProperties(prefix = "vegetable")//@ConfigurationProperties(prefix = "vegetable")说明在配置文件 .properties中寻找以vegetable开头的所有值
@PropertySource("classpath:vegetables.properties")//@PropertySource("classpath:vegetables.properties")表示 配置文件的路径，classpath代表resources
public class VegetableConfig {
    private  String name;
    private  String egg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgg() {
        return egg;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }
}
