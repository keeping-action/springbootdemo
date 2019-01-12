package com.ivmiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Copyright CAINIAO WMS. All rights reserved. Organization : Outbound Optimization Center
 * <p>
 * add your describe
 *
 * @author zhiJin
 * @date 2019/1/10
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo-consumer.xml"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

    