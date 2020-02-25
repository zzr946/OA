package com.lsl.manager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String jobnumber;
    private String password;
    private String department;
    private String name;
    private String sex;
    private String age;
    private String phone;
    private String state;
    private String jurisdiction;
    private String spare1;
    private String spare2;
    private String spare3;
    private String spare4;
    private String spare5;
}