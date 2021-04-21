package com.zr.vueapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 修改修改
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.zr.vueapi.mapper"})
public class VueapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueapiApplication.class, args);
    }

}
