package com.microservices.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microservices.java.model.Employee;
import com.microservices.java.service.EmployeeService;

@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);
		System.out.println("Hello You");
		
		
		EmployeeService service = new EmployeeService();
		
		Employee temp = service.getById(3);
		System.out.println(temp.toString());
		
		System.out.println("Hello You Again");
		
		
	}

}
