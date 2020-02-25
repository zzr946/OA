package com.lsl.manager.service;

import com.lsl.manager.dto.RecordDTO;
import com.lsl.manager.dto.ResultDTO;
import com.lsl.manager.enums.MsgEnum;
import com.lsl.manager.mapper.RecordMapper;
import com.lsl.manager.mapper.UserMapper;
import com.lsl.manager.model.Record;
import com.lsl.manager.model.RecordExample;
import com.lsl.manager.model.User;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Recordtb)表服务接口
 *
 * @author zhiran.zhao@hand-china.com
 * @since 2020-01-17 22:20:30
 */
@Service
public class RecordService {

    @Resource
    RecordMapper recordMapper;
    @Resource
    UserMapper userMapper;

    /**
     * 根据id查询登录人的所有奖惩记录
     * @param userid
     * @return
     */
    public ResultDTO selectByUserid(String userid) {
        ResultDTO resultDTO=new ResultDTO();
        //根据员工id查询员工编号
        String jobnumber= userMapper.selectByPrimaryKey(userid).getJobnumber();
        //用于返会页面的DTO对象集合
        List<RecordDTO> list=new ArrayList<>();
        //根据员工员工id查询出来的奖惩记录
        List<Record> list1=new ArrayList<>();
        RecordExample example = new RecordExample();
        example.createCriteria().andUseridEqualTo(userid);
        list1 = recordMapper.selectByExample(example);
        //将奖惩记录的属性赋值给DTO对象，并将员工编号赋值给DTO对象
        list1.stream().forEach(s->{
            RecordDTO recordDTO = new RecordDTO();
            BeanUtils.copyProperties(s,recordDTO);
            recordDTO.setJobnumber(jobnumber);
            list.add(recordDTO);
        });

        //System.out.println("Reocrd:"+list1);
        //System.out.println("RecordDTO:"+list);
        resultDTO.setCode(0);
        resultDTO.setMsg(MsgEnum.SYS_SELECT_SUCCESS.getMsg());
        resultDTO.setData(list);

        return resultDTO;
    }
}