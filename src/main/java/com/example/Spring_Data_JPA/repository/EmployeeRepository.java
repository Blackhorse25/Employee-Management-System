package com.example.Spring_Data_JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_Data_JPA.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
