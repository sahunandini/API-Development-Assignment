package com.example.API_Development.config;

import com.example.API_Development.data.CsvDataLoader;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;




@Configuration
@EnableConfigurationProperties
@EnableJpaRepositories(
        basePackages = "com.example.api.repositories",
        repositoryFactoryBeanClass = JpaRepositoryFactoryBean.class
)
public class CsvConfig {

    @Bean
    @ConfigurationProperties(prefix = "csv.file")
    public CsvDataLoader csvDataLoader(EntityManagerFactory entityManagerFactory) {
        return new CsvDataLoader(entityManagerFactory);
    }
}
