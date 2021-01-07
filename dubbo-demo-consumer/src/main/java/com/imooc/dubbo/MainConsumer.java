package com.imooc.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author liuzike
 * @Date 1/6/21
 **/

@SpringBootApplication
public class MainConsumer {

    public static void main(String[] args) {
        SpringApplication.run(MainConsumer.class, args);
    }
}
