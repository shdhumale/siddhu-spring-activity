package com.siddhu.springactiviti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siddhu.springactiviti.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public Employee findByName(String name);

}