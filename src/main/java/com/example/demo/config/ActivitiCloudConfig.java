package com.example.demo.config;

import org.activiti.cloud.common.swagger.conf.SwaggerAutoConfiguration;
import org.activiti.cloud.services.common.security.keycloak.config.CommonSecurityAutoConfiguration;
import org.activiti.cloud.services.identity.keycloak.config.RuntimeBundleSecurityAutoConfiguration;
import org.activiti.cloud.starter.audit.configuration.EnableActivitiAudit;
import org.activiti.cloud.starter.query.configuration.EnableActivitiQuery;
import org.activiti.cloud.starter.rb.configuration.ActivitiRuntimeBundle;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@ActivitiRuntimeBundle
@EnableAutoConfiguration(exclude = {
        RuntimeBundleSecurityAutoConfiguration.class,
        CommonSecurityAutoConfiguration.class,
        SwaggerAutoConfiguration.class
})
@EnableActivitiQuery
@EnableActivitiAudit
public class ActivitiCloudConfig {
}
