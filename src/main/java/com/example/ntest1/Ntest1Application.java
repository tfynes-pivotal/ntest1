package com.example.ntest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ntest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ntest1Application.class, args);
	}

	@RequestMapping("/")
	public String index() {
		String message = System.getenv("message");
		if (message == null) message = "";
		String response = message;
		System.out.println("message");
		return response + "\n";
	}

}
