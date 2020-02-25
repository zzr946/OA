package com.lsl.manager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {
    private String id;//部门编号
    private String depname; //部门名称
    private String spare1;
    private String spare2;
    private String spare3;
    private String spare4;
    private String spare5;

    private Long count;//该部门总人数
}
