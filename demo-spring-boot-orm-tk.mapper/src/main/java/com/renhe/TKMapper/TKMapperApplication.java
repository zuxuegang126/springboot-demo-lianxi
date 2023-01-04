package com.renhe.TKMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.renhe.tk.mapper")

@SpringBootApplication
public class TKMapperApplication {
    public static void main(String[] args) {
        SpringApplication.run(TKMapperApplication.class,args);
    }
}
