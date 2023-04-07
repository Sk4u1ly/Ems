package com.example.emsOnetoOne.payload;

import com.example.emsOnetoOne.entites.Salary;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long eid;
    private String name;
    private String mobile;


}
