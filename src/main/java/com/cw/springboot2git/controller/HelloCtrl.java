package com.cw.springboot2git.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {

    public void hello(){
        System.out.println("hello");
    }


}
