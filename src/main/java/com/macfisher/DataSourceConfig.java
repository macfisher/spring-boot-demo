package com.macfisher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig
{
    @Bean(name = "datasource")
    @Profile("development")
    DataSource development() { return new DataSource("development-url", 9999); }

    @Bean(name = "datasource")
    @Profile("production")
    DataSource production() { return new DataSource("production-url", 9999); }
}
