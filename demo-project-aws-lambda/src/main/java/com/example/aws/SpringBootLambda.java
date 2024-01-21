package com.example.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SpringBootLambda
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringBootLambda.class,args);
        System.out.println( "Hello World!" );
    }
}
