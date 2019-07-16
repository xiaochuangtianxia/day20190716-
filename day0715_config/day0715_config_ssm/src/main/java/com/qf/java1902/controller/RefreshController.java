package com.qf.java1902.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/15.
 */
@RestController
@RefreshScope   //springcloud配置中心配置刷新时，自动将新的配置更新到该类对应的字段中
public class RefreshController {

    @Value("${myname}")
    private String name;

    @RequestMapping(value = "/val")
    public String showInfo(){
        return name;
    }

}
