package com.cn.zbb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by kane on 2016/10/25.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.cn.zbb"})
@MapperScan("com.cn.zbb.dao")
public class MybatisSpringBootApp {
    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringBootApp.class, args);
    }
}
