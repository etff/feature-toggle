package com.example.featuretoggle.config;

import io.getunleash.DefaultUnleash;
import io.getunleash.Unleash;
import io.getunleash.util.UnleashConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeatureToggleConfig {
    @Value("${io.getunleash.app-name}")
    private String appName;

    @Value("${io.getunleash.app-name}")
    private String instanceId;

    @Value("${io.getunleash.api-url}")
    private String apiUrl;

    @Value("${io.getunleash.api-token}")
    private String apiToken;

    @Bean
    public Unleash unleash() {
        UnleashConfig config = UnleashConfig.builder()
                .appName(appName)
                .instanceId(instanceId)
                .unleashAPI(apiUrl)
                .apiKey(apiToken)
                .build();

        return new DefaultUnleash(config);
    }
}
