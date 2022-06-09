package com.scrumpoker.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ScrumPokerLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrumPokerLoginApplication.class, args);
	}

}
