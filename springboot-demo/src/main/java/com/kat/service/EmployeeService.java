package com.kat.service;

import java.util.List;

import com.kat.model.Employee;

public interface EmployeeService {

	public List<Employee> findAllEmployees();

	public Employee findEmployeeById(long id);

	public Employee createEmployee(Employee employee);

}
