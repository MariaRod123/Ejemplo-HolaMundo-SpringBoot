package com.sofka.canterauy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CanterauyApplication {

	public static void main(String[] args) {

		SpringApplication.run(CanterauyApplication.class, args);
	}
	@GetMapping("/hola")
	public String hola(@RequestParam(value = "name", defaultValue = "Mundo ") String name) {
		return String.format("Hola %s!", name);
	}




}
