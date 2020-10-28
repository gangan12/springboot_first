package com.example.hello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        String msg = "hello world ";
        System.out.println(msg);
        return msg;
    }
}
