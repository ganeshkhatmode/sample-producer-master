package com.gk.service;

import java.util.List;

import com.gk.model.Employee;

public interface EmployeeService {

	public List<Employee> findByAll();
	public Employee findById(int employeeId);
}
