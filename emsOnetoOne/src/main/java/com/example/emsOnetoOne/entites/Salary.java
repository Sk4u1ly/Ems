package com.example.emsOnetoOne.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "salaries")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid")
    private Long sid;

    @Column(name = "amount")
    private double amount;

    @OneToOne(fetch =FetchType.LAZY)
    @JoinColumn(name = "eid",referencedColumnName = "eid",unique = true)
    private Employee employee;
}