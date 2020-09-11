package com.china.feign.controller;

import com.china.feign.inter.MyInterface;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    MyInterface mi;

    @RequestMapping("/hello")
    public String my(){

        return mi.hello();
    }

    @RequestMapping(value = "selectById",produces = "application/json;charset=utf-8")
    public Student selectById(Integer id){
        return mi.selectById(4);
    }
}
