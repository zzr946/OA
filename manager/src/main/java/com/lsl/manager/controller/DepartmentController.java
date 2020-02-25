package com.lsl.manager.controller;

import com.lsl.manager.dto.ResultDTO;
import com.lsl.manager.model.Department;
import com.lsl.manager.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * (Department)表控制层
 *
 * @author zhiran.zhao@hand-china.com
 * @since 2020-01-28 17:08:56
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    /**
     * 新增部门的方法
     * @param depname 部门名称
     * @return
     */
    @PostMapping("/adddep/{depname}")
    @ResponseBody
    public ResultDTO adddep(@PathVariable("depname")String depname){
        Department department=new Department();
        department.setDepname(depname);
        //调用service层的方法，将新增的部门信息存入数据库
        ResultDTO resultDTO=departmentService.adddep(department);
        return resultDTO;
    }

    /**
     * 修改部门信息
     * @param id 部门编号
     * @param depname 部门名称
     * @param count 部门总人数
     * @return
     */
    @PostMapping("/editdep/{id}/{depname}/{count}")
    @ResponseBody
    public ResultDTO editdep(@PathVariable("id")String id,
                             @PathVariable("depname")String depname,
                             @PathVariable("count")String count){
        //调用service层，修改部门表
        ResultDTO resultDTO = departmentService.editdep(id,depname,count);
        return resultDTO;
    }


}