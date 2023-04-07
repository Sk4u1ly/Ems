package com.ems.services.impl;



import com.ems.entities.Employee;
import com.ems.payloads.EmployeeDto;
import com.ems.repositories.EmployeeRepository;
import com.ems.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee=new Employee();
        employee.setEid(employeeDto.getEid());
       employee.setName(employeeDto.getName());
       employee.setCity(employeeDto.getCity());
       employee.setEmail(employeeDto.getEmail());
       employee.setMobile(employeeDto.getMobile());

        Employee emp = employeeRepository.save(employee);

        return toDto(emp) ;
    }

    private EmployeeDto toDto(Employee emp) {
     EmployeeDto employeeDto =new EmployeeDto();
     employeeDto.setName(emp.getName());
     employeeDto.setCity(emp.getCity());
     employeeDto.setEmail(emp.getEmail());
     employeeDto.setMobile(emp.getMobile());
     employeeDto.setEid(emp.getEid());

        return employeeDto;
    }


}
