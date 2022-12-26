package com.duing;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @SpringBootApplication 申明 DemoApplication为 SpringBoot 的入口类
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);//SpringApplication的run方法利用反射识别DemoApplication 为 SpringBoot 的入口类，并且执行DemoApplication的main方法

    }
}
