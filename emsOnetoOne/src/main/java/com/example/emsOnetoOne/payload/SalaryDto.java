package com.example.emsOnetoOne.payload;


import com.example.emsOnetoOne.entites.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SalaryDto {

    private Long sid;
    private double amount;


}
