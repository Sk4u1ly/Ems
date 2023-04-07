package com.example.emsOnetoOne.repositories;

import com.example.emsOnetoOne.entites.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary,Long> {
}
