package com.duing.cofig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

@Component//@Component，声明将这个组件添加至spring容器中

@ConfigurationProperties(prefix = "foot")//@ConfigurationProperties(prefix = "foot")申明到配置文件application.properties中寻找以foot为一级目录（前缀的）的 meat、rice、vegetable的值赋给FootConfig类的对应属性;
public class FootConfig {
    private String meat;
    private String rice;
    private String vegetable;

    public void setRice(String rice) {
        this.rice = rice;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }
    public String getVegetable() {
        return vegetable;
    }
    public String getMeat() {
        return meat;
    }



    public String getRice() {
        return rice;
    }







    @Override
    public String toString() {
        return "FootConfig{" +
                "meat='" + meat + '\'' +
                ", rice='" + rice + '\'' +
                ", vegetable='" + vegetable + '\'' +
                '}';
    }
}


