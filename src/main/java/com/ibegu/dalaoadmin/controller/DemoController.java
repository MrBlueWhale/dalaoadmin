package com.ibegu.dalaoadmin.controller;

import com.ibegu.dalaoadmin.domain.Demo;
import com.ibegu.dalaoadmin.domain.Test;
import com.ibegu.dalaoadmin.resp.CommonResp;
import com.ibegu.dalaoadmin.service.DemoService;
import com.ibegu.dalaoadmin.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author Angus Lan
 * @Date 2021/4/9 11:46
 **/

@RestController    //用来返回字符串（controll+responsebody）
// @Controller   //用来返回页面
@RequestMapping("/demo")
public class DemoController {
    @Resource
    DemoService demoService;



    @GetMapping("/list")
    public CommonResp list(){

        CommonResp<List<Demo>> resp = new CommonResp<>();
        List<Demo> list = demoService.list();
        resp.setContent(list);
        return resp;

    }

}
