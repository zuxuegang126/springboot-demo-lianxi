package com.renhe;

import javafx.application.Application;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan  //mapper扫描
@SpringBootApplication
public class OrmMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisApplication.class,args);
    }
}
