package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

@RestController
@RequestMapping("/")
class HomeController {
	@GetMapping
	public Map<String, String> home() {
		Map<String, String> response = new HashMap<>();
		response.put("name", "Votre Nom");
		response.put("email", "votreMail@campus-eni.fr");
		response.put("date", LocalDate.now().toString());
		return response;
	}
}