package com.siddhu.springactiviti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siddhu.springactiviti.model.Employee;
import com.siddhu.springactiviti.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// create the list of Employees into the database who perform the task
	public void createEmployee() {

		if (employeeRepository.findAll().size() == 0) {

			employeeRepository.save(new Employee("emp1", "role1", "simple"));
			employeeRepository.save(new Employee("emp2", "role2", "complex"));
			employeeRepository.save(new Employee("emp3", "role3", "simple"));
		}
	}
}
