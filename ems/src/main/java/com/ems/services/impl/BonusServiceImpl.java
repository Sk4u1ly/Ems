package com.ems.services.impl;

import com.ems.entities.Bonus;
import com.ems.entities.Employee;
import com.ems.payloads.BonusDto;
import com.ems.repositories.BonusRepository;

import com.ems.repositories.EmployeeRepository;
import com.ems.services.BonusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BonusServiceImpl implements BonusService {
@Autowired
   private BonusRepository bonusRepository;

@Autowired
  private   EmployeeRepository employeeRepository;



    public BonusDto createBonus(Long eid, BonusDto bonusDto) {
        Employee employee = employeeRepository.findById(eid).get();

        Bonus bonus =new Bonus();

        bonus.setAmount(bonusDto.getAmount());
        bonus.setEmployee(employee);
        Bonus bonus1 = bonusRepository.save(bonus);


        BonusDto dto = new BonusDto();
        employee.setEid(employee.getEid());
        dto.setBid(bonus1.getBid());
        dto.setAmount(bonus1.getAmount());
        return dto;
    }


}
