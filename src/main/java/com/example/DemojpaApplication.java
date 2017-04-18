package com.example;



import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemojpaApplication {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemojpaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner printMessage(ApplicationContext ctx){
		return args -> {
			/*
			Employee e = new Employee();
			e.setFirstName("Budi");
			e.setLastName("Buah");
			e.setGender("Not Found");
			e.setDob(new Date(0));
			*/
			//employeeRepository.save(e);
		};
	}
}
