package com.orange.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {
	@Value("${spring.application.name}")
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
	@RequestMapping(value = "/front")
    public String name() {
      return "Hello String Test 2!";
   }
}
