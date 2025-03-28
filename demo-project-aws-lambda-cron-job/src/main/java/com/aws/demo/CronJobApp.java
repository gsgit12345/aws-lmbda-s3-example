package com.aws.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class CronJobApp {
    public static void main(String[] args) {
        SpringApplication.run(CronJobApp.class,args);
        System.out.println("Hello World!");
    }
}
