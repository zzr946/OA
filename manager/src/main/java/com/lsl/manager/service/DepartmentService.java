package com.lsl.manager.service;

import com.lsl.manager.dto.DepartmentDTO;
import com.lsl.manager.dto.ResultDTO;
import com.lsl.manager.enums.MsgEnum;
import com.lsl.manager.mapper.DepartmentMapper;
import com.lsl.manager.mapper.UserMapper;
import com.lsl.manager.model.Department;
import com.lsl.manager.model.DepartmentExample;
import com.lsl.manager.model.UserExample;
import com.lsl.manager.tool.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Department)表服务接口
 *
 * @author zhiran.zhao@hand-china.com
 * @since 2020-01-28 17:08:56
 */
@Service
public class DepartmentService{

    @Resource
    DepartmentMapper departmentMapper;
    @Resource
    UserMapper userMapper;

    /**
     * 查询所有部门信息  下拉框显示
     * @return
     */
    public ResultDTO selectAll() {
        ResultDTO resultDTO=new ResultDTO();
        DepartmentExample example = new DepartmentExample();
        List<Department> departments = departmentMapper.selectByExample(example);
        resultDTO.setData(departments);
        return resultDTO;
    }

    /**
     * 查询所有部门信息  部门管理页面显示
     * @return
     */
    public ResultDTO findAll() {
        ResultDTO resultDTO=new ResultDTO();
        //定义用于返会页面的List集合
        List<DepartmentDTO> list=new ArrayList<>();
        //查询所有部门信息
        DepartmentExample example = new DepartmentExample();
        List<Department> departments = departmentMapper.selectByExample(example);
        departments.stream().forEach(s->{
            //根据部门名称查询员工表中，该部门的总人数
            UserExample example1 = new UserExample();
            example1.createCriteria().andDepartmentEqualTo(s.getDepname());
            long l = userMapper.countByExample(example1);
            DepartmentDTO dto = new DepartmentDTO();
            dto.setId(s.getId());
            dto.setDepname(s.getDepname());
            dto.setCount(l);
            list.add(dto);
        });
        resultDTO.setData(list);
        return resultDTO;
    }

    /**
     * 新增部门的方法
     * @param department
     * @return
     */
    public ResultDTO adddep(Department department) {
        ResultDTO resultDTO = new ResultDTO();
        department.setId(Tools.getUUID());//设置id
        int i = departmentMapper.insert(department);
        if(i==1){
            //成功
            resultDTO.setCode(0);
            resultDTO.setMsg(MsgEnum.SYS_ADD_FAMILY_SUCCESS.getMsg());
            resultDTO.setData(null);
        }else{
            //失败
            resultDTO.setCode(1);
            resultDTO.setMsg(MsgEnum.SYS_ADD_FAMILY_ERROR.getMsg());
            resultDTO.setData(null);
        }
        return resultDTO;
    }

    /**
     * 修改部门信息
     * @param id 部门id
     * @param depname 部门名称
     * @param count 部门总人数  不在部门表中
     * @return
     */
    public ResultDTO editdep(String id, String depname, String count) {
        ResultDTO resultDTO = new ResultDTO();
        Department department = new Department();
        department.setId(id);
        department.setDepname(depname);
        //根据id修改数据表
        int i = departmentMapper.updateByPrimaryKeySelective(department);
        if(i==1){
            //成功
            resultDTO.setCode(0);
            resultDTO.setMsg(MsgEnum.SYS_EDIT_OWN_SUCCESS.getMsg());
            resultDTO.setData(null);
        }else{
            //失败
            resultDTO.setCode(1);
            resultDTO.setMsg(MsgEnum.SYS_EDIT_OWN_ERROR.getMsg());
            resultDTO.setData(null);
        }
        return resultDTO;
    }
}