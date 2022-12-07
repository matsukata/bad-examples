package com;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com", repositoryBaseClass = ZooRepositoryImpl.class)
public class ConfigJpaConfig {
}
