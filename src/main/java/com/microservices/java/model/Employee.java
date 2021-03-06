package com.microservices.java.model;

public class Employee {
	private int id;
	private String name;
	private String role;
	private Double Salary;
	public int getId() {
		return id;
	}
	
	public Employee(int id, String name, String role, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		Salary = salary;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", Salary=" + Salary + "]";
	}

	
}
