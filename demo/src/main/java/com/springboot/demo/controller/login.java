package com.springboot.demo.controller;

import com.springboot.demo.bean.Tuser;
import com.springboot.demo.service.TuserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("index")
public class login {

    private static final Logger logger = LoggerFactory.getLogger(login.class);

    @Autowired
    private TuserService userService;

    @RequestMapping("/test")
    public String index(){
        logger.info("test");
        return "this is spring boot test!";
    }

    @RequestMapping("t1")
    public List<Tuser> getAllUser(){
        return userService.getAll();
    }
}
