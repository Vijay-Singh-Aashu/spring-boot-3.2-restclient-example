package com.excellence_springboot_rest_api_demo.service;

import java.util.List;

import com.excellence_springboot_rest_api_demo.dto.EmployeeDto;

public interface EmployeeService {

	EmployeeDto createEmployee(EmployeeDto employeeDto);

	EmployeeDto getEmployeeById(Long employeeId);

	List<EmployeeDto> getAllEmployees();

	EmployeeDto updateEmployee(EmployeeDto employeeDto);

	void deleteEmployee(Long employeeId);

}
