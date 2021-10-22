package com.jpa.librarymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.jpa")
@EnableJpaRepositories
public class LibraryManagementUsingJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementUsingJpaApplication.class, args);
	}

}
