package com.pluralsight.conferencedemo.config;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

     Logger logger = LoggerFactory.getLogger(this.getClass());
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/SpringBootDB");
        builder.username("postgres");
        builder.password("root");
        logger.info("JDBC properties has been set in configuration class");
        return builder.build();

    }
}
