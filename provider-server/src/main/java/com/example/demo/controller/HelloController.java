package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    String Port;
    @RequestMapping("/hi")
    public String getHome(@RequestParam String name){
        return "hi "+name+",i am from port:" +Port;
    }
}
