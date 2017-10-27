package com.codeair.app.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.codeair.app.domain"})
@EnableJpaRepositories(basePackages = {"com.codeair.app.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
