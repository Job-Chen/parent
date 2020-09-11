package com.china.provider2.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@EnableAutoConfiguration
public class MyService {

    @RequestMapping("/hello")
    public String hello(){
        return "吃饭睡觉打豆豆";
    }
}
