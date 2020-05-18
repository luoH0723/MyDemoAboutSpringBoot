package com.lhstudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lhstudy.dao")
public class MybootdemoEmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybootdemoEmsApplication.class, args);
    }

}
