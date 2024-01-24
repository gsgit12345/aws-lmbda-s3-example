package com.example.aws.lambda;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("mydemo")
@Data
@NoArgsConstructor
public class DemoConfig {
    private String accessid;
    private String secretkey;

}