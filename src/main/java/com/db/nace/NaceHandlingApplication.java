package com.db.nace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class NaceHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NaceHandlingApplication.class, args);
	}

}
