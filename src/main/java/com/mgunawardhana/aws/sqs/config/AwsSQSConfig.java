package com.mgunawardhana.aws.sqs.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created By - mgunawardhana
 * Date - 2024-01-07
 * Time - 08.04
 */
@Configuration
public class AwsSQSConfig {
    @Value("${cloud.aws.credentials.access-key}")
    private String accessKey;

    @Value("${cloud.aws.credentials.secret-key}")
    private String secretKey;

    @Value("${cloud.aws.region.static}")
    private String region;

    @Bean
    public QueseMessageSender queseMessageSender() {
        return new QueseMessageSender();
    }
}