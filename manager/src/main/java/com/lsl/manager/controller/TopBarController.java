package com.lsl.manager.controller;

import com.lsl.manager.dto.ResultDTO;
import com.lsl.manager.mapper.DepartmentMapper;
import com.lsl.manager.mapper.UserMapper;
import com.lsl.manager.model.Family;
import com.lsl.manager.model.Record;
import com.lsl.manager.model.User;
import com.lsl.manager.model.UserExample;
import com.lsl.manager.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 点击顶部导航栏后跳转相应的页面
 */
@Controller
public class TopBarController {


    @Resource
    FamilyService familyService;
    @Resource
    UserMapper userMapper;
    @Resource
    UserService userService;
    @Resource
    RecordService recordService;
    @Resource
    KaoQinService kaoQinService;
    @Resource
    SalaryService salaryService;
    @Resource
    DepartmentService departmentService;


    /**
     * 点击首页按钮，跳转到首页
     * @return
     */
    @GetMapping("/main")
    public String home(){
        return "main";
    }

    /**
     * 点击个人中心，跳转到个人中心页面
     * @return
     */
    @GetMapping("/info")
    public String info(HttpServletRequest request){
        //System.out.println("跳转到info页面的请求进来了");
        HttpSession session=request.getSession();
        //获取当前登录人的id
        String id = ((User)session.getAttribute("user")).getId();
        //System.out.println("当前登录人的id:"+id);
        //根据id查询当前登录人的所有信息
        User user = userMapper.selectByPrimaryKey(id);
        //刷新session   将用户信息存入session中
        session.setAttribute("user",user);


        //查询当前登录人的所有家属信息
        List<Family> list = familyService.selectFamilys(id);
        //将家属信息存入session中
        session.setAttribute("familys",list);


        return "info";
    }

    /**
     * 点击奖惩记录，跳转到奖惩记录页面
     * @return
     */
    @GetMapping("/rewards")
    public String rewards(HttpServletRequest request){
        HttpSession session = request.getSession();
        //获取当前登录人的id
        String userid=((User)session.getAttribute("user")).getId();
        //System.out.println("获取的员工id为："+userid);
        //将该人的所有奖惩记录查询出来
        ResultDTO resultDTO = recordService.selectByUserid(userid);
        //将登录人的所有奖惩存入session中
        session.setAttribute("record",resultDTO.getData());
        return "rewards";
    }

    /**
     * 点击考勤统计，跳转到考勤统计页面
     * @return
     */
    @GetMapping("/kaoqin")
    public String kaoqin(HttpServletRequest request){
        HttpSession session = request.getSession();
        //获取当前登录人的id
        String userid=((User)session.getAttribute("user")).getId();
        //System.out.println("获取的员工id为："+userid);
        //根据id查询所有考勤情况
        ResultDTO resultDTO = kaoQinService.selectByUserId(userid);
        //将查询的所所有考勤记录存入session中
        session.setAttribute("kaoqins",resultDTO.getData());
        return "kaoqin";
    }

    /**
     * 点击薪酬福利，跳转到薪酬福利页面
     * @return
     */
    @GetMapping("/salary")
    public String salary(HttpServletRequest request){
        HttpSession session = request.getSession();
        //获取当前登录人的id
        String userid=((User)session.getAttribute("user")).getId();
        //查询所有奖惩工资 情况
        ResultDTO resultDTO=salaryService.selectSalaryByUserId(userid);
        System.out.println("result中的salary:"+resultDTO.getData());
        //将查询到工资情况存入session中
        session.setAttribute("salary",resultDTO.getData());
        return "salary";
    }

    /*********************************管理员显示************************************/

    /**
     * 管理员   点击员工管理，跳转到员工管理页面
     * @return
     */
    @GetMapping("/empmanager")
    public String employeeManager(HttpServletRequest request){
        HttpSession session = request.getSession();
        //获取所有员工信息
        UserExample example = new UserExample();
        List<User> users = userMapper.selectByExample(example);
        //将suers存入session中
        session.setAttribute("employees",users);
        return "empmanager";
    }

    /**
     * 管理员   点击部门管理，跳转到部门管理页面
     * @return
     */
    @GetMapping("/depmanager")
    public String depManager(HttpServletRequest request){
        HttpSession session = request.getSession();
        //调用DepartmentService,查询所所有部门信息
        ResultDTO resultDTO = departmentService.findAll();
        //System.out.println(resultDTO.getData());
        session.setAttribute("department",resultDTO.getData());
        //返回部门管理页面
        return "depmanager";
    }

    /**
     * 管理员   点击工资管理，跳转到工资管理页面
     * @return
     */
    @GetMapping("/salarymanager")
    public String salaryManager(HttpServletRequest request){
        return "salarymanager";
    }



}
