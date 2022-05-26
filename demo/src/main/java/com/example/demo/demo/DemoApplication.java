package com.example.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
class DemoController{

	@GetMapping("/")
	public Customer get(){
		return new Customer(123, "Walesson reis");
	}
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Customer {
	private Integer cpf;
	private String name;
}
