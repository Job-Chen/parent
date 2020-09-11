package com.china.feign.inter;

import entity.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider")
public interface MyInterface {

    @RequestMapping(value = "/hello",produces = "application/json;charset=utf-8")
    public String hello();

    @RequestMapping(value = "selectById",produces = "application/json;charset=utf-8")
    public Student selectById(@RequestParam("id") Integer id);
}
