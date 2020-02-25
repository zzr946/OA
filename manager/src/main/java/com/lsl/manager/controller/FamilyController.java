package com.lsl.manager.controller;

import com.lsl.manager.dto.ResultDTO;
import com.lsl.manager.model.Family;
import com.lsl.manager.model.User;
import com.lsl.manager.service.FamilyService;
import com.lsl.manager.tool.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * (Familytb)表控制层
 *
 * @author zhiran.zhao@hand-china.com
 * @since 2020-01-17 22:20:29
 */
@Controller
public class FamilyController {

    @Autowired
    private FamilyService familyService;

    @PostMapping("/delfamily/{id}")
    @ResponseBody
    public ResultDTO delFamily(@PathVariable("id") String id){
        //System.out.println("要删除的家属id:"+id);
        ResultDTO resultDTO = familyService.delFamily(id);
        return resultDTO;
    }

    /**
     * 修改家属信息
     * @param id 需要修改信息的家属id
     * @param folkname 家属姓名
     * @param folksex 家属性别
     * @param folkage 家属年龄
     * @param folkrelation 家属关系
     * @param spare1 联系方式
     * @return
     */
    @PostMapping("/editFamily/{id}/{folkname}/{folksex}/{folkage}/{folkrelation}/{spare1}")
    @ResponseBody
    public ResultDTO editFamily(@PathVariable("id")String id,
                                @PathVariable("folkname") String folkname,
                                @PathVariable("folksex")String folksex,
                                @PathVariable("folkage")String folkage,
                                @PathVariable("folkrelation")String folkrelation,
                                @PathVariable("spare1")String spare1){
//        System.out.println("请求进来了！！！！！"+id+"  "+folkname+"  "+folksex+"  "+folkage+"  "+folkrelation+"  "+spare1);
        Family family=new Family();
        family.setId(id);
        family.setFolkname(folkname);
        family.setFolksex(folksex);
        family.setFolkage(folkage);
        family.setFolkrelation(folkrelation);
        family.setSpare1(spare1);
        ResultDTO resultDTO=familyService.updateFamily(family);
        return resultDTO;
    }

    @PostMapping("/addFamily/{folkname}/{folksex}/{folkage}/{folkrelation}/{spare1}")
    @ResponseBody
    public ResultDTO addFamily(@PathVariable("folkname") String folkname,
                               @PathVariable("folksex")String folksex,
                               @PathVariable("folkage")String folkage,
                               @PathVariable("folkrelation")String folkrelation,
                               @PathVariable("spare1")String spare1,
                               HttpServletRequest request){
        //获取当前登录的用户id
        HttpSession session = request.getSession();
        String userid = ((User) session.getAttribute("user")).getId();
        //System.out.println("请求进来了！！！！！"+userid+"  "+folkname+"  "+folksex+"  "+folkage+"  "+folkrelation+"  "+spare1);

        Family family=new Family();
        family.setId(Tools.getUUID());
        family.setUserid(userid);
        family.setFolkname(folkname);
        family.setFolksex(folksex);
        family.setFolkage(folkage);
        family.setFolkrelation(folkrelation);
        family.setSpare1(spare1);
        ResultDTO resultDTO = familyService.addFamily(family);
        return resultDTO;
    }



}