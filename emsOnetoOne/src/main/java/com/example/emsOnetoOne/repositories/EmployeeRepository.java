package com.example.emsOnetoOne.repositories;

import com.example.emsOnetoOne.entites.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
