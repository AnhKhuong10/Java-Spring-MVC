package com.spring.Mvc.SpringMVC.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String handleHello(){
        return "Hello from Service";
    }
}
