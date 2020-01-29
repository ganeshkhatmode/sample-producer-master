package com.gk.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gk.model.Employee;
import com.gk.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Override
	public List<Employee> findByAll() {
		
		return loadDataset();
	}
	

	@Override
	public Employee findById(int employeeId) {
		
		Optional<Employee> opEmp = loadDataset().stream().filter(employee->employee.getEmployeeId()==employeeId).findAny();
		if(opEmp.isPresent())
			return opEmp.get();
		else
			throw new EmployeeNotFoundException();
	}



	private List<Employee> loadDataset(){
		return Arrays.asList(new Employee[]{
			new Employee(1, "Ganesh Khatmode", "New Sangavi"),
			new Employee(2, "Sachin Mane", "Kolkata"),
			new Employee(3, "Manoj Kulkarni", "Shivaji Nagar")
		});
	}

}
