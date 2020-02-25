package com.lsl.manager.controller;

import com.lsl.manager.dto.ResultDTO;
import com.lsl.manager.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * (Salarytb)表控制层
 *
 * @author zhiran.zhao@hand-china.com
 * @since 2020-01-17 22:20:30
 */
@RestController
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    /**
     * 查看工资详情
     * @param jobnumber
     * @param request
     * @return
     */
    @PostMapping("/salary/info/{jobnumber}")
    public ResultDTO salaryinfo(@PathVariable("jobnumber")String jobnumber,
                                HttpServletRequest request){
        //调用service层的方法，查询工资详情
        ResultDTO resultDTO=salaryService.selectSalaryInfo(jobnumber);
        return resultDTO;
    }


}