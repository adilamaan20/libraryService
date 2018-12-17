package com.genpact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackages = "com.genpact.repository")
@SpringBootApplication
public class LibertyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibertyApplication.class, args);
	}
}
