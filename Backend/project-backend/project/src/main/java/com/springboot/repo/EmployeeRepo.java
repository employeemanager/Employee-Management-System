package com.springboot.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	 void deleteEmployeeById(Long id);

	    Employee findEmployeeById(Long id);

}
