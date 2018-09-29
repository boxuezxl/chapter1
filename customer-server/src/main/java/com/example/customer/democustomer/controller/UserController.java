package com.example.customer.democustomer.controller;

import com.example.customer.democustomer.entity.UserEntity;
import com.example.customer.democustomer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value="/customer/userlist")
    public List<UserEntity> getQueryList(){
        return userService.list();
    }
}
