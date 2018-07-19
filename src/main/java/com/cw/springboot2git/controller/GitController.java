package com.cw.springboot2git.controller;

        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

    @RequestMapping(value = "/hi/{name}" , method = RequestMethod.GET)
    public String hi(@PathVariable("name") String name){
        System.out.println("hi--->"+name);
        System.out.println("hello is successful...");
        return "hi---->"+name;
    }

}
