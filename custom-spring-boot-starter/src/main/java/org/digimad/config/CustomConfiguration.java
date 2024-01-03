package org.digimad.config;

import org.digimad.listener.CustomListener;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class CustomConfiguration {

    @Bean
    public CustomListener customListener() {
        return new CustomListener();
    }
}
