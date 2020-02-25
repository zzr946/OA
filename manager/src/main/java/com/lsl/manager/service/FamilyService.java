package com.lsl.manager.service;

import com.lsl.manager.dto.ResultDTO;
import com.lsl.manager.enums.MsgEnum;
import com.lsl.manager.mapper.FamilyMapper;
import com.lsl.manager.model.Family;
import com.lsl.manager.model.FamilyExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Familytb)表服务接口
 *
 * @author zhiran.zhao@hand-china.com
 * @since 2020-01-17 22:20:29
 */
@Service
public class FamilyService{

    @Resource
    FamilyMapper familyMapper;
    /**
     * 根据当前登录人的id查询所有的家属信息
     * @param id 当前登录人的id
     * @return
     */
    public List<Family> selectFamilys(String id) {
        FamilyExample example = new FamilyExample();
        example.createCriteria().andUseridEqualTo(id);
        List<Family> families = familyMapper.selectByExample(example);
        //System.out.println("查询出来的所有家属信息："+families);
        return families;
    }

    /**
     * 根据id删除家属信息
     * @param id 需要删除的家属id
     * @return
     */
    public ResultDTO delFamily(String id) {
        ResultDTO resultDTO=new ResultDTO();
        //调用mapper根据id删除
        int i = familyMapper.deleteByPrimaryKey(id);
        if(i==1){
            //删除成功
            resultDTO.setCode(0);
            resultDTO.setMsg(MsgEnum.SYS_DELETE_FAMILY_SUCCESS.getMsg());
            resultDTO.setData(null);
        }else{
            //删除失败
            resultDTO.setCode(1);
            resultDTO.setMsg(MsgEnum.SYS_DELETE_FAMILY_ERROR.getMsg());
            resultDTO.setData(null);
        }

        return resultDTO;
    }

    /**
     * 根据id修改家属信息
     * @param family 封装的家属信息
     * @return
     */
    public ResultDTO updateFamily(Family family) {
        ResultDTO resultDTO=new ResultDTO();
        int i = familyMapper.updateByPrimaryKeySelective(family);
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
        return resultDTO;
    }

    /**
     * 添加家属信息
     * @param family 封装的家属信息
     * @return
     */
    public ResultDTO addFamily(Family family) {
        ResultDTO resultDTO=new ResultDTO();
        int i = familyMapper.insert(family);
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
}