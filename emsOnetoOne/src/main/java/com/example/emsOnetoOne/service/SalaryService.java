package com.example.emsOnetoOne.service;

import com.example.emsOnetoOne.payload.SalaryDto;

public interface SalaryService {
    SalaryDto save(Long eid, SalaryDto salaryDto);
}
