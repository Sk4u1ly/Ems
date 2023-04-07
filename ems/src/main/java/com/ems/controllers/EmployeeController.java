package com.ems.controllers;

import com.ems.payloads.BonusDto;
import com.ems.payloads.EmployeeDto;
import com.ems.services.BonusService;
import com.ems.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private BonusService bonusService;


    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto dto = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @PostMapping("/{eid}/bonus")
    public ResponseEntity<BonusDto> createBonus(@PathVariable("eid") Long eid, @RequestBody BonusDto bonusDto) {
        BonusDto dto = bonusService.createBonus(eid,bonusDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

}