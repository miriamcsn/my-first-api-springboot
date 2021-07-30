package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/") // isso é um endpoint ou path/caminho dentro da API
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/miriam")
	public String miriam() {
		return "Greetings from Miriam!";
	}
}
