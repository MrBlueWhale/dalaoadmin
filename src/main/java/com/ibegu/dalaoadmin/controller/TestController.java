package com.ibegu.dalaoadmin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Angus Lan
 * @Date 2021/4/9 11:46
 **/

@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;


    @GetMapping("/hello")
    public String hello(){

        return "Hello World !" + testHello;

    }

    @PostMapping("/hello/post")
    // public String helloPost(Map<String, String> map){
    public String helloPost(String name){

        return "Hello World ! Post" + name;

    }




}
