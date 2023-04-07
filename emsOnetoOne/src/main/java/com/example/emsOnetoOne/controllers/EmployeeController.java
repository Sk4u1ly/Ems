package com.example.emsOnetoOne.controllers;


import com.example.emsOnetoOne.payload.EmployeeDto;
import com.example.emsOnetoOne.payload.SalaryDto;
import com.example.emsOnetoOne.service.EmployeeService;
import com.example.emsOnetoOne.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private SalaryService salaryService;

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployeeDto(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto dto = employeeService.save(employeeDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @PostMapping("/{eid}/salary")
    public ResponseEntity<SalaryDto> createSalaryDto(@PathVariable("eid") Long eid,@RequestBody SalaryDto salaryDto) {
        SalaryDto dto = salaryService.save(eid,salaryDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

}