package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;
    @RequestMapping(value="/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }


}
