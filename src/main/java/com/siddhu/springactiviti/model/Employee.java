package com.siddhu.springactiviti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class Employee {


	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String designation;
	private String taskType;

	public Employee() {
	}

	/**
	 * @param name
	 * @param designation
	 * @param taskType
	 */
	public Employee(String name, String designation, String taskType) {

		this.name = name;
		this.designation = designation;
		this.taskType = taskType;
		
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", taskType=" + taskType
				+ "]";
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}


	/**
	 * @return the taskType
	 */
	public String getTaskType() {
		return taskType;
	}

	/**
	 * @param taskType the taskType to set
	 */
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	
}
