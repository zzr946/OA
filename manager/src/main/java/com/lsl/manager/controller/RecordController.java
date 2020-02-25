package com.lsl.manager.controller;

import com.lsl.manager.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Recordtb)表控制层
 *
 * @author zhiran.zhao@hand-china.com
 * @since 2020-01-17 22:20:30
 */
@RestController
@RequestMapping("/api/recordtb")
public class RecordController {

    @Autowired
    private RecordService recordService;


}