package com.lsl.manager.controller;

import com.lsl.manager.dto.ResultDTO;
import com.lsl.manager.mapper.UserMapper;
import com.lsl.manager.model.User;
import com.lsl.manager.service.DepartmentService;
import com.lsl.manager.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * (Usertb)表控制层
 *
 * @author zhiran.zhao@hand-china.com
 * @since 2020-01-17 22:20:30
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    DepartmentService departmentService;

    //跳转到员工信息详情页面
    @GetMapping("/employee")
    public String employee(){
        return "employee";
    }

    //跳转到添加员工页面
    @GetMapping("/add")
    public String addEmpPage(){
        return "addemployee";
    }

    //跳转道修改密码页面
    @GetMapping("/editpwd")
    public String editpwdPage(){
        return "/editpwd";
    }

    /**
     * 用户登录的方法
     * @param jobNumber 员工账号(工号)
     * @param password  密码
     * @param model
     * @param request
     * @return
     */
    @PostMapping("/page")
    public String login(@RequestParam("jobNumber") String jobNumber,
                        @RequestParam("password") String password,
                        Model model, HttpServletRequest request) {
        //System.out.println("请求进来了" + jobNumber + "--" + password);
        //调用service的方法,查询数据库
        ResultDTO resultDTO = userService.LoginSelect(jobNumber, password);
//        System.out.println("Controller层测试：" + resultDTO.getMsg());
//        System.out.println(resultDTO.getData());
        HttpSession session = request.getSession();
        //如果登录失败，则返回到登录页面
        if (resultDTO.getData() == null) {
            //model.addAttribute("error", resultDTO);
            session.setAttribute("loginerror", resultDTO);
            return "index";
        } else {

            //登录成功，将用户信息存入session
            //request.getSession().setAttribute("user", resultDTO.getData());
            session.setAttribute("user", resultDTO.getData());
            //登录成功，跳转到mian页面
            return "main";
        }
    }

    /**
     * 用户修改个人信息
     * @param id 当前登录的用户id
     * @param phone 需要修改成的手机号
     * @return
     */
    @PostMapping("/owninfo/{id}/{phone}")
    @ResponseBody
    public ResultDTO editOwn(@PathVariable("id") String id,
                          @PathVariable("phone") String phone){
        //System.out.println("手机号："+phone+",点前登录的用户id:"+id);
        //调用service层的方法，修改用户信息
        ResultDTO result = userService.updateInfo(id,phone);
        return result;
    }

    /**
     * 退登录的方法
     * @param request
     * @return
     */
    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        //清空session
        session.removeAttribute("user");
        //返回到登录页面
        return "index";
    }


    /**
     * 查看员工的详细信息
     * @param userid  员工id
     * @return
     */
    @GetMapping("/employee/{userid}")
    @ResponseBody
    public ResultDTO employeeInfo(@PathVariable("userid")String userid,
                                  HttpServletRequest request){
        HttpSession session = request.getSession();
        //根据员工id查询员工信息
        ResultDTO result = userService.selectemployeeInfo(userid);

        //查询所有部门信息，将用于修改部门是在下拉框中显示
        ResultDTO resultDTO = departmentService.selectAll();
        //System.out.println("所有部门信息："+resultDTO.getData());

        //将所有的部门信息存入session中（下拉框中显示用）
        session.setAttribute("option_dep",resultDTO.getData());
        //将查询出来的用户信息存入session中
        session.setAttribute("employeeInfo",result.getData());
        return result;
    }

    /**
     * 管理员修改员工信息
     * @param id 员工id
     * @param jobnumber 员工编号  工号
     * @param name 员工姓名
     * @param department 部门
     * @param sex 性别
     * @param age 年龄
     * @param phone 联系方式
     * @param state 岗位状态
     * @param requestq
     * @return
     */
    @PostMapping("/editemployee/{id}/{jobnumber}/{name}/{department}/{sex}/{age}/{phone}/{state}")
    @ResponseBody
    public ResultDTO editEmployee(@PathVariable("id") String id,
                                  @PathVariable("jobnumber") String jobnumber,
                                  @PathVariable("name") String name,
                                  @PathVariable("department") String department,
                                  @PathVariable("sex") String sex,
                                  @PathVariable("age") String age,
                                  @PathVariable("phone") String phone,
                                  @PathVariable("state") String state,
                                  HttpServletRequest requestq){
        //System.out.println("editEmployee:"+id+"-"+jobnumber+"-"+name+"-"+department+"-"+sex+"-"+age+"-"+phone+"-"+state);
        User user = new User();
        user.setId(id);
        user.setJobnumber(jobnumber);
        user.setName(name);
        user.setDepartment(department);
        user.setSex(sex);
        user.setAge(age);
        user.setPhone(phone);
        user.setState(state);
        //调用service层   将修改后的数据存入数据库
        ResultDTO resultDTO = userService.editEmployee(user);
        return resultDTO;
    }

    /**
     * 跳转到添加员工页面
     * @param request
     * @return
     */
    @GetMapping("//addemp")
    public String addEmp(HttpServletRequest request){
        HttpSession session = request.getSession();
        //调用departmentService，查询所有部门信息
        ResultDTO resultDTO = departmentService.selectAll();
        //将所有的部门信息存入session中（下拉框中显示用）
        session.setAttribute("option_dep",resultDTO.getData());
        return "addemployee";
    }



    /**
     * 管理员添加员工信息
     * @param jobnumber 员工编号  工号
     * @param name 员工姓名
     * @param department 部门
     * @param sex 性别
     * @param age 年龄
     * @param phone 联系方式
     * @param state 岗位状态
     * @param requestq
     * @return
     */
    @PostMapping("/addemployee/{jobnumber}/{name}/{department}/{sex}/{age}/{phone}/{state}")
    @ResponseBody
    public ResultDTO addEmployee(@PathVariable("jobnumber") String jobnumber,
                                  @PathVariable("name") String name,
                                  @PathVariable("department") String department,
                                  @PathVariable("sex") String sex,
                                  @PathVariable("age") String age,
                                  @PathVariable("phone") String phone,
                                  @PathVariable("state") String state,
                                  HttpServletRequest requestq){
        System.out.println("addEmployee:"+jobnumber+"-"+name+"-"+department+"-"+sex+"-"+age+"-"+phone+"-"+state);
        User user = new User();
        user.setJobnumber(jobnumber);
        user.setName(name);
        user.setDepartment(department);
        user.setSex(sex);
        user.setAge(age);
        user.setPhone(phone);
        user.setState(state);
        //调用service层   用户信息存入数据库
        ResultDTO resultDTO = userService.addEmployee(user);
        return resultDTO;
    }

    /**
     * 修改密码的方法
     * @param id 用户id
     * @param oldpwd 原密码
     * @param newpwd 新密码
     * @param request
     * @return
     */
    @PostMapping("/editpwd/{id}/{oldpwd}/{newpwd}")
    @ResponseBody
    public ResultDTO editPwd(@PathVariable("id")String id,
                             @PathVariable("oldpwd")String oldpwd,
                             @PathVariable("newpwd")String newpwd,
                             HttpServletRequest request){
        HttpSession session = request.getSession();
        //调用service层，修改数据
        ResultDTO resultDTO = userService.editPwd(id,oldpwd,newpwd);
//        if(resultDTO.getCode()==0){
//            //修改成功，调用退出登录方法，清空session,并返回到登录页面
//            logout(request);
//        }
        return resultDTO;
    }

}