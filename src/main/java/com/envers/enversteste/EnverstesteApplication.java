package com.envers.enversteste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.envers.repository.config.EnableEnversRepositories;

@SpringBootApplication
@EnableEnversRepositories
public class EnverstesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnverstesteApplication.class, args);
	}

}
