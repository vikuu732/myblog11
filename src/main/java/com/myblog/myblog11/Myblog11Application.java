package com.myblog.myblog11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.myblog.myblog11")
public class Myblog11Application {

	public static void main(String[] args) {
		SpringApplication.run(Myblog11Application.class, args);
	}

}
