package com.excellence_springboot_rest_api_demo.converter;

import com.excellence_springboot_rest_api_demo.dto.EmployeeDto;
import com.excellence_springboot_rest_api_demo.entity.Employee;

public class EmployeeConverter {
	
	// Convert Employee JPA entity to EmployeeDto
	// Convert EmployeeDto to Employee JPA entity
	public static Employee mapToEmployee(EmployeeDto employeeDto) {
		Employee employee = new Employee(
				employeeDto.getId(),
				employeeDto.getFirstName(),
				employeeDto.getLastName(),
				employeeDto.getEmail()
			);
		return employee;
	}
	
	// Convert Employee JPA entity to EmployeeDto
	// Convert EmployeeDto to Employee JPA entity
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		EmployeeDto employeeDto = new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail()
			);
		return employeeDto;
	}

}
