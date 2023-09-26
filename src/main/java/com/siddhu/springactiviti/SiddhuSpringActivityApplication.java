package com.siddhu.springactiviti;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.siddhu.springactiviti.service.EmployeeService;

@SpringBootApplication
public class SiddhuSpringActivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiddhuSpringActivityApplication.class, args);
	}

    @Bean
    CommandLineRunner init(final EmployeeService employeeService) {

		return new CommandLineRunner() {
			public void run(String... strings) throws Exception {
				employeeService.createEmployee();
			}
		};
	}

}
