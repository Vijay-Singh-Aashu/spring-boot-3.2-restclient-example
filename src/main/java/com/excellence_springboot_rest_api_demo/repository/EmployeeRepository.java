package com.excellence_springboot_rest_api_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence_springboot_rest_api_demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
