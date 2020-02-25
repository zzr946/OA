package com.lsl.manager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salary {
    private String id;
    private String userid;
    private Double basicsalary;
    private Double bonus;
    private Double deduct;
    private Double realsalary;
    private String state;
    private String spare1;
    private String spare2;
    private String spare3;
    private String spare4;
    private String spare5;
}