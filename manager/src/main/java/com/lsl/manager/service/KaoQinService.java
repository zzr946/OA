package com.lsl.manager.service;

import com.lsl.manager.dto.KaoQinDTO;
import com.lsl.manager.dto.ResultDTO;
import com.lsl.manager.enums.MsgEnum;
import com.lsl.manager.mapper.KaoQinMapper;
import com.lsl.manager.mapper.UserMapper;
import com.lsl.manager.model.KaoQin;
import com.lsl.manager.model.KaoQinExample;
import com.lsl.manager.model.User;
import com.lsl.manager.tool.Tools;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.tools.Tool;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * (Kaoqintb)表服务接口
 *
 * @author zhiran.zhao@hand-china.com
 * @since 2020-01-17 22:20:30
 */
@Service
public class KaoQinService {

    @Resource
    KaoQinMapper kaoQinMapper;
    @Resource
    UserMapper userMapper;

    /**
     * 查询员工的所有考勤
     * @param userid 员工id
     * @return
     */
    public ResultDTO selectByUserId(String userid) {
        ResultDTO resultDTO=new ResultDTO();
        List<KaoQinDTO> list=new ArrayList<>();
        List<KaoQin> list1=new ArrayList<>();
        //根据员工id查询员工编号
        String jobnumber=((User)userMapper.selectByPrimaryKey(userid)).getJobnumber();

        KaoQinExample example = new KaoQinExample();
        example.createCriteria().andUseridEqualTo(userid);
        list1 = kaoQinMapper.selectByExample(example);
        list1.stream().forEach(s->{
            KaoQinDTO kaoQinDTO = new KaoQinDTO();
            BeanUtils.copyProperties(s,kaoQinDTO);
            kaoQinDTO.setJobnumber(jobnumber);
            list.add(kaoQinDTO);
        });
        //System.out.println(list1);
        //System.out.println(list);
        resultDTO.setCode(0);
        resultDTO.setMsg(MsgEnum.SYS_SELECT_SUCCESS.getMsg());
        resultDTO.setData(list);
        return resultDTO;
    }

    /**
     * 签到操作
     * @param userid 签到人id
     * @return
     */
    public ResultDTO qiaodao(String userid) {
        ResultDTO resultDTO=new ResultDTO();
        //获取当前系统时间
        long l = System.currentTimeMillis();
        //将时间毫秒数转化为时间
        Date date = new Date(l);
        //将date格式转为String格式
        String time = Tools.dateToStr("yyyy-MM-dd", date);
        //根据员工id与签到时间查询   检查用户是否重复签到
        KaoQinExample example = new KaoQinExample();
        example.createCriteria().andUseridEqualTo(userid).andSpare1EqualTo(time);
        example.setOrderByClause("spare1 asc");//根据时间排序
        List<KaoQin> kaoQins = kaoQinMapper.selectByExample(example);
        if(kaoQins!=null&&!kaoQins.isEmpty()){
            //已经签到过  重复签到直接返回
            resultDTO.setCode(1);
            resultDTO.setMsg(MsgEnum.SYS_QIANDAO_ERROR.getMsg());
            resultDTO.setData(null);
        }else{
            //未签到   执行签到操作
            KaoQin kaoQin=new KaoQin();
            kaoQin.setId(Tools.getUUID());
            kaoQin.setUserid(userid);
            kaoQin.setState("已签到");
            kaoQin.setSpare1(time);
            int i = kaoQinMapper.insert(kaoQin);

            resultDTO.setCode(0);
            resultDTO.setMsg(MsgEnum.SYS_QIANDAO_SUCCESS.getMsg());
            resultDTO.setData(null);
        }
        return resultDTO;
    }
}