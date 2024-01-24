package com.example.aws;

import com.example.aws.lambda.DemoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigurationProperties(value = {DemoConfig.class
})
public class SpringBootLambda
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringBootLambda.class,args);
        System.out.println( "Hello World!" );
    }
}
