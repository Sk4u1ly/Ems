package com.example.emsOnetoOne.service.impl;

import com.example.emsOnetoOne.entites.Employee;
import com.example.emsOnetoOne.entites.Salary;
import com.example.emsOnetoOne.payload.SalaryDto;
import com.example.emsOnetoOne.repositories.EmployeeRepository;
import com.example.emsOnetoOne.repositories.SalaryRepository;
import com.example.emsOnetoOne.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
 private SalaryRepository salaryRepository;
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public SalaryDto save(Long eid, SalaryDto salaryDto) {
        Employee employee = employeeRepository.findById(eid).get();
         Salary salary =new Salary();
         salary.setSid(salaryDto.getSid());
         salary.setAmount(salaryDto.getAmount());
         salary.setEmployee(employee);

        Salary sal = salaryRepository.save(salary);

        SalaryDto dto =new SalaryDto();


        dto.setSid(sal.getSid());
        dto.setAmount(sal.getAmount());
        return dto;
    }
}
