package com.lsl.manager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaryDTO {
    private String userid;//员工id
    private String jobnumber;//员工编号
    private Double basicsalary;//基本工资
    private Double bonus;//奖金
    private Double deduct;//各项扣除
    private Double realsalary;//实发工资
    private String state;//发放状态
    private String spare1;//时间

    private Integer shouldDay;//考勤应到天数
    private Integer realityDay;//考勤实到天数
}
