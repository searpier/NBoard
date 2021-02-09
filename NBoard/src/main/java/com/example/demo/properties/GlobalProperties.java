package com.example.demo.properties;

import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalProperties {
	private String driverClassName = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private String username = "hr";
	private String password = "hr";

	public String getDriverClassName() {
		return driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
