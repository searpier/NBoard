package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration(exclude = { DataSourceTransactionManagerAutoConfiguration.class,
		DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = "com.example.demo")
public class NBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(NBoardApplication.class, args);
	}

}
