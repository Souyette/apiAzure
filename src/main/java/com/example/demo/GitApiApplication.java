package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Map;

@SpringBootApplication
public class GitApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitApiApplication.class, args);
	}
}

@RestController
@RequestMapping("/")
class HomeController {
	@GetMapping
	public Map<String, String> home() {
		return Map.of(
				"name", "Votre Nom",
				"email", "votreMail@campus-eni.fr",
				"date", LocalDate.now().toString()
		);
	}
}