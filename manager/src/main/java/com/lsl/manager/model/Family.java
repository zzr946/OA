package com.lsl.manager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Family {
    private String id;
    private String userid;
    private String folkname;
    private String folksex;
    private String folkage;
    private String folkrelation;
    private String spare1;
    private String spare2;
    private String spare3;
    private String spare4;
    private String spare5;
}