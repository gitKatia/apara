package com.kat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kat.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
