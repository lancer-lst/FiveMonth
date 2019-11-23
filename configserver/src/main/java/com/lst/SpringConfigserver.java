package com.lst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigserver {
    public static void main(String[] args) {
        SpringApplication.run(SpringConfigserver.class,args);
    }
}
