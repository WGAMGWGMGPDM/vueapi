package com.zr.vueapi.controller;

import com.zr.vueapi.domain.Deptinfo;
import com.zr.vueapi.io.ResultObj;
import com.zr.vueapi.service.DeptinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 张忍忍
 * @Date: 2021/3/21 17:07
 */
@RestController
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptinfoService deptinfoService;

    @RequestMapping("listAllDept")
    public ResultObj listAllDept(){
        List<Deptinfo> list = deptinfoService.list();
        return new ResultObj(list);
    }

}
