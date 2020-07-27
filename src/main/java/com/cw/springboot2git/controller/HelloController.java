package com.cw.springboot2git.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class HelloController {

    public String hello() {
        return "hello";
    }


}
