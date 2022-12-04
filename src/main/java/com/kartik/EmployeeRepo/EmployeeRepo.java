package com.kartik.EmployeeRepo;

import org.springframework.data.repository.CrudRepository;

import com.kartik.EmployeeEntity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
