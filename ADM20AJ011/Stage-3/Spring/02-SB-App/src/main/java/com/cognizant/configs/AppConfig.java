package com.cognizant.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cognizant.util.PasswordEncryptor;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("--- AppConfig :: Constructor ---");
	}

	@Bean
	public PasswordEncryptor getPasswordEncryptorInstance() {
		return new PasswordEncryptor();
	}
}
