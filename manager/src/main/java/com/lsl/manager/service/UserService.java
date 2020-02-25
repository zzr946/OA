package com.lsl.manager.service;

import com.lsl.manager.dto.ResultDTO;
import com.lsl.manager.enums.MsgEnum;
import com.lsl.manager.mapper.UserMapper;
import com.lsl.manager.model.User;
import com.lsl.manager.model.UserExample;
import com.lsl.manager.tool.Tools;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Usertb)表服务接口
 *
 * @author zhiran.zhao@hand-china.com
 * @since 2020-01-17 22:20:30
 */
@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    /**
     * 用户登录   根据工号与密码查询该用户是否存在
     *
     * @param jobNumber 工号
     * @param password  密码
     * @return
     */
    public ResultDTO LoginSelect(String jobNumber, String password) {
        ResultDTO resultDTO = new ResultDTO();
        //调用mapper层的方法，查询数据库
        //根据用户名(工号)和密码查询
        UserExample userExample = new UserExample();
        userExample.createCriteria().andJobnumberEqualTo(jobNumber)
                .andPasswordEqualTo(Tools.getMD5(password));
        List<User> users = userMapper.selectByExample(userExample);
        //System.out.println("users:"+users);
        //System.out.println(MsgEnum.SYS_USERNAME_OR_PASSWORD_ERROR.getCode());
        if (users == null || users.isEmpty()) {
            //如果未查询到用户，则返回错误信息
            resultDTO.setMsg(MsgEnum.SYS_USERNAME_OR_PASSWORD_ERROR.getMsg());//用户名或密码错误
            resultDTO.setData(null);
        } else {
            //登录成功
            resultDTO.setMsg(MsgEnum.SYS_LOGIN_SUCCESS.getMsg());//登录成功
            resultDTO.setData(users.get(0));
        }
        return resultDTO;
    }

    /**
     * 修改个人资料(只能修改手机号码)
     * @param id 需要修改信息的用户id
     * @param phone 修改成的电话号码
     * @return
     */
    public ResultDTO updateInfo(String id, String phone) {
        ResultDTO resultDTO=new ResultDTO();
        //调用Mapper 根据id修改
        User u=new User();
        u.setId(id);
        u.setPhone(phone);
        int i = userMapper.updateByPrimaryKeySelective(u);
        if(i==1){
            //修改成功
            //根据id查询修改后的用户信息
            User user = userMapper.selectByPrimaryKey(id);
            resultDTO.setCode(0);//0表示成功
            resultDTO.setMsg(MsgEnum.SYS_EDIT_OWN_SUCCESS.getMsg());
            resultDTO.setData(user);
        }else{
            //修改失败
            resultDTO.setCode(0);//0表示成功
            resultDTO.setMsg(MsgEnum.SYS_EDIT_OWN_SUCCESS.getMsg());
            resultDTO.setData(null);
        }
        return resultDTO;
    }

    /**
     * 根据id查看员工的详细信息
     * @param userid 员工id
     * @return
     */
    public ResultDTO selectemployeeInfo(String userid) {
        ResultDTO resultDTO=new ResultDTO();
        User user = userMapper.selectByPrimaryKey(userid);
        resultDTO.setCode(0);//0表示成功
        resultDTO.setMsg(MsgEnum.SYS_SELECT_SUCCESS.getMsg());
        resultDTO.setData(user);
        return resultDTO;
    }

    /**
     * 管理员修改用户信息
     * @param user
     * @return
     */
    public ResultDTO editEmployee(User user) {
        ResultDTO resultDTO=new ResultDTO();
        //设置权限
        String dep=user.getDepartment();
        if("系统管理员".equals(dep)){
            //系统管理员权限为1
            user.setJurisdiction("1");
        }else{
            //普通用户权限为0
            user.setJurisdiction("0");//新用户默认权限为0
        }
        int i = userMapper.updateByPrimaryKeySelective(user);
        if(i==1){
            //修改成功
            resultDTO.setCode(0);//0表示成功
            resultDTO.setMsg(MsgEnum.SYS_EDIT_OWN_SUCCESS.getMsg());
            resultDTO.setData(null);
        }else{
            //修改失败
            resultDTO.setCode(0);//0表示成功
            resultDTO.setMsg(MsgEnum.SYS_EDIT_OWN_SUCCESS.getMsg());
            resultDTO.setData(null);
        }
        return resultDTO;
    }

    /**
     * 添加员工信息
     * @param user
     * @return
     */
    public ResultDTO addEmployee(User user) {
        ResultDTO resultDTO=new ResultDTO();
        //设置id
        user.setId(Tools.getUUID());
        //设置面
        user.setPassword(Tools.getMD5("123456"));//设置初始密码123456
        //设置权限
        String dep=user.getDepartment();
        if("系统管理员".equals(dep)){
            //系统管理员权限为1
            user.setJurisdiction("1");
        }else{
            //普通用户权限为0
            user.setJurisdiction("0");//新用户默认权限为0
        }
        //调用mapper将信息存入数据库
        int i = userMapper.insert(user);
        if(i==1){
            //添加成功
            resultDTO.setCode(0);//0表示成功
            resultDTO.setMsg(MsgEnum.SYS_ADD_FAMILY_SUCCESS.getMsg());
            resultDTO.setData(null);
        }else{
            //添加失败
            resultDTO.setCode(0);//0表示成功
            resultDTO.setMsg(MsgEnum.SYS_ADD_FAMILY_ERROR.getMsg());
            resultDTO.setData(null);
        }
        return resultDTO;
    }

    /**
     * 用户修改密码
     * @param id 用户id
     * @param oldpwd 原密码
     * @param newpwd 新密码
     * @return
     */
    public ResultDTO editPwd(String id, String oldpwd, String newpwd) {
        ResultDTO resultDTO = new ResultDTO();
        List<User> users=new ArrayList<>();
        //根据id与原密码查询数据库
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(id).andPasswordEqualTo(Tools.getMD5(oldpwd));
        users = userMapper.selectByExample(example);
        if(users!=null&&!users.isEmpty()){
            //查询到数据，原密码正确，修改密码
            //根据id修改密码
            User user = new User();
            user.setId(id);
            user.setPassword(Tools.getMD5(newpwd));
            int i = userMapper.updateByPrimaryKeySelective(user);
            if(i==1){
                //修改成功
                resultDTO.setCode(0);
                resultDTO.setMsg(MsgEnum.SYS_EDIT_OWN_SUCCESS.getMsg());
                resultDTO.setData(null);
            }else{
                //修改失败
                resultDTO.setCode(1);
                resultDTO.setMsg(MsgEnum.SYS_EDIT_OWN_ERROR.getMsg());
                resultDTO.setData(null);
            }

        }else{
            //未查询到数据  原密码输入错误，返回到修改页面
            resultDTO.setCode(2);
            resultDTO.setMsg(MsgEnum.SYS_OLD_PASSWORD_ERROR.getMsg());
            resultDTO.setData(null);
        }
        return resultDTO;
    }
}