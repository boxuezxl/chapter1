package com.example.customer.democustomer.service;

import com.example.customer.democustomer.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {
    private static final String REST_URL_PREFIX = "http://SERVICE-HI";
    @Autowired
    RestTemplate restTemplate;

    public List<UserEntity> list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/userlist", List.class);
    }
}
