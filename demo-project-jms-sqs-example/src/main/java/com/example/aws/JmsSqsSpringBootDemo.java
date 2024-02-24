package com.example.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class JmsSqsSpringBootDemo
{
    public static void main( String[] args )
    {
        SpringApplication.run(JmsSqsSpringBootDemo.class,args);

        System.out.println( "Hello World!" );
    }
}
