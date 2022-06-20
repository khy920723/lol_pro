package com.khy1.lol_pro.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
//    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public DataSource dataSource(){

        return DataSourceBuilder.create().build();
    }
}
