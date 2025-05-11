package com.computernetwork.smartstructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.computernetwork"})
@ComponentScan(basePackages = {"com.computernetwork"})
@EnableJpaRepositories(basePackages = "com.computernetwork")
//@EnableConfigurationProperties(value = GlobalProperties.class)
@SpringBootApplication
public class SmartstructureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartstructureApplication.class, args);
	}

}
