package com.qf.java1902.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/15.
 */
@RestController
public class OrderController {

    @Value("${myname}")
    private String name;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/val")
    public String order(){
        return "myname:"+name+",port:"+port;
    }
}
