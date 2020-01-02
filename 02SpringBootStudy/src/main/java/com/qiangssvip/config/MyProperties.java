package com.qiangssvip.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "jdbc")
@Data
public class MyProperties {
    private String url;

    private String driverClassName;

    private String username;

    private String password;
}
