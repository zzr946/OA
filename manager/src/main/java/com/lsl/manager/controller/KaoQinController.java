package com.lsl.manager.controller;

import com.lsl.manager.dto.ResultDTO;
import com.lsl.manager.model.User;
import com.lsl.manager.service.KaoQinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * (Kaoqintb)表控制层
 *
 * @author zhiran.zhao@hand-china.com
 * @since 2020-01-17 22:20:30
 */
@Controller
public class KaoQinController {

    @Autowired
    private KaoQinService kaoQinService;

    /**
     * 员工签到的方法
     * @param request
     * @return
     */
    @GetMapping("/qiandao")
    @ResponseBody
    public ResultDTO qiandao(HttpServletRequest request){
        //System.out.println("请求进来了！！！000");
        HttpSession session = request.getSession();
        //获取suerid
        String userid = ((User) session.getAttribute("user")).getId();

        //调用service层的方法   插入数据  签到
        ResultDTO resultDTO = kaoQinService.qiaodao(userid);
        //System.out.println(resultDTO.getMsg());
        return resultDTO;
    }
}