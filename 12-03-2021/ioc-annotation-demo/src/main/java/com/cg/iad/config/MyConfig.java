package com.cg.iad.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.cg.iad.service")
public class MyConfig {
	
	@Bean
	public LocalDateTime current() {
		return LocalDateTime.now();
	}
}
