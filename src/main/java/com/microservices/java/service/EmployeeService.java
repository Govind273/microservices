package com.microservices.java.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.microservices.java.model.Employee;

@Component
public class EmployeeService {

	private static List<Employee> employees = new ArrayList<Employee>();
	
	static {
		Employee employee1 = new Employee(1,"Govind","SE",10300.00);
		Employee employee2 = new Employee(2, "Rohan","Gym Freak", 3000.00);
		Employee employee3 = new Employee(3, "Sidd","MBA", 30000.00);
		Employee employee4 = new Employee(4, "Rahul","Manager", 90000.00);
		Employee employee5 = new Employee(5, "Pawan","Lawyer", 50000.00);
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
	}
	
	public List<Employee> getAllEmployee(){
		return employees;
	}
	
	public Employee getById(int id) {
		
		for(Employee e : employees) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}
	
	public Employee getByName(String name) {
			
			for(Employee e : employees) {
				if(e.getName() == name) {
					return e;
				}
			}
			return null;
		}
	
	public boolean addEmployee(Employee e) {
		List<Employee> employee = employees;
		return employee.add(e);
	}
}
