package com.example.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SnsSprinBootApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(SnsSprinBootApp.class,args);
        System.out.println( "Hello World!" );
    }
}
