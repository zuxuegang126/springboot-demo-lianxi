package com.duing;


import com.duing.cofig.FootConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


/**
 *
 */
@SpringBootApplication//@SpringBootApplication 申明 DemoConfigurationApplication为 SpringBoot 的入口类
@EnableConfigurationProperties({FootConfig.class})//@EnableConfigurationProperties({FootConfig.class})告诉主程序入口类，要自动引入配置文件，配置文件对应的类作为它的参数
public class DemoConfigurationApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoConfigurationApplication.class,args);//SpringApplication的run方法利用反射识别DemoConfigurationApplication 为 SpringBoot 的入口类，并且执行DemoConfigurationApplication的main方法

    }
}
