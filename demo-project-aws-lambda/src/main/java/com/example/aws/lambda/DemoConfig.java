package com.example.aws.lambda;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("mydemo")
@Data
public class DemoConfig {
    private String accessid;
    private String secretkey;

}