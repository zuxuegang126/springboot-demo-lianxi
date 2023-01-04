package com.renhe;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan ("com.renhe.mapper") //mapper扫描
@SpringBootApplication
public class OrmMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisApplication.class,args);
    }
}
