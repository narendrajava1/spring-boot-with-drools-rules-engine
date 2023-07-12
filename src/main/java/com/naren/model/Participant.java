package com.naren.model;

import lombok.Data;

@Data
public class Participant {

 private String name;
 private int age;
 private int creditScore;
 private long annualSalary;
 private long existingDebt;
 private long loanAmount;
}