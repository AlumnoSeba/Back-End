package com.prueba.uno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class UnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnoApplication.class, args);
	}
       @Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://portfolio-113b8.web.app/portfolioweb").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
}
