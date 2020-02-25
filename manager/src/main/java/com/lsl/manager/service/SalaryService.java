package com.lsl.manager.service;

import com.lsl.manager.dto.RecordDTO;
import com.lsl.manager.dto.ResultDTO;
import com.lsl.manager.dto.SalaryDTO;
import com.lsl.manager.enums.MsgEnum;
import com.lsl.manager.mapper.SalaryMapper;
import com.lsl.manager.mapper.UserMapper;
import com.lsl.manager.model.Salary;
import com.lsl.manager.model.SalaryExample;
import com.lsl.manager.model.User;
import com.lsl.manager.model.UserExample;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Salarytb)表服务接口
 *
 * @author zhiran.zhao@hand-china.com
 * @since 2020-01-17 22:20:30
 */
@Service
public class SalaryService {

    @Resource
    SalaryMapper salaryMapper;
    @Resource
    UserMapper userMapper;

    /**
     * 根据员工id查询员工的所有月份的薪资情况
     * @param userid 员工id
     * @return
     */
    public ResultDTO selectSalaryByUserId(String userid) {
        ResultDTO resultDTO=new ResultDTO();
        //根据员工id查询员工编号
        String jobnumber= userMapper.selectByPrimaryKey(userid).getJobnumber();
        //定义salary集合，用户存储从数据库中查询出来的结果
        List<Salary> list1=new ArrayList<>();
        //定义用户返回到前端的DTO
        List<SalaryDTO> list=new ArrayList<>();
        //根据用户id查询用户的薪资情况
        SalaryExample example = new SalaryExample();
        example.createCriteria().andUseridEqualTo(userid);
        list1 = salaryMapper.selectByExample(example);
//        System.out.println("工资详情：list1"+list1);
        //将salary的属性赋值给DTO对象，并将员工编号赋值给DTO对象
        list1.stream().forEach(s->{
            SalaryDTO salaryDTO = new SalaryDTO();
            BeanUtils.copyProperties(s,salaryDTO);
            salaryDTO.setJobnumber(jobnumber);
            list.add(salaryDTO);
        });
//        System.out.println("工资详情集合："+list);
        resultDTO.setCode(0);
        resultDTO.setMsg(MsgEnum.SYS_SELECT_SUCCESS.getMsg());
        resultDTO.setData(list);

        return resultDTO;
    }

    /**
     * 查看员工工资条详细信息
     * @param jobnumber 员工编号
     * @return
     */
    public ResultDTO selectSalaryInfo(String jobnumber) {
        ResultDTO resultDTO=new ResultDTO();
        List<SalaryDTO> list=new ArrayList<>();
        //根据员工编号查询员工id
        UserExample userExample = new UserExample();
        userExample.createCriteria().andJobnumberEqualTo(jobnumber);
        List<User> users = userMapper.selectByExample(userExample);
        String userid=users.get(0).getId();

        //根据员工id查询工资表
        SalaryExample example = new SalaryExample();
        example.createCriteria().andUseridEqualTo(userid);
        List<Salary> salaryList = salaryMapper.selectByExample(example);
        salaryList.stream().forEach(s->{
            SalaryDTO salaryDTO = new SalaryDTO();
            BeanUtils.copyProperties(s,salaryDTO);
            salaryDTO.setJobnumber(jobnumber);
            list.add(salaryDTO);
        });

        //获取工资条时间

//        查询考勤情况




        return resultDTO;
    }
}