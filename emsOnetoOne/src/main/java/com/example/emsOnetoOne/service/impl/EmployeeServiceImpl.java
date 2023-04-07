package com.example.emsOnetoOne.service.impl;

import com.example.emsOnetoOne.entites.Employee;
import com.example.emsOnetoOne.payload.EmployeeDto;
import com.example.emsOnetoOne.repositories.EmployeeRepository;
import com.example.emsOnetoOne.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository  employeeRepository;



    @Override
    public EmployeeDto save(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setEid(employeeDto.getEid());
        employee.setName(employeeDto.getName());
        employee.setMobile(employeeDto.getMobile());
        Employee employee1 = employeeRepository.save(employee);

        EmployeeDto dto =new EmployeeDto();
        dto.setEid(employee1.getEid());
        dto.setName(employee1.getName());
        dto.setMobile(employee1.getMobile());

        return dto;
    }



}
