package com.example.demo.config;

import org.kie.server.springboot.autoconfiguration.security.DefaultWebSecurityConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(
        exclude = DefaultWebSecurityConfig.class
)
public class JBPMConfig {
}
