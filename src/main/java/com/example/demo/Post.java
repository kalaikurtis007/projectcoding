package com.example.demo;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

@Component
public class Post {

    //@Value("${mysql.db.host}")
    private String dbHost;
    @Autowired
    private UserService userService;

    @PostConstruct
    public void init() {
        System.out.println("Hi System pass is 0" + this.dbHost);
        //userService.getAllUsers();
    }
}