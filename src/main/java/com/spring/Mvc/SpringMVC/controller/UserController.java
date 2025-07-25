package com.spring.Mvc.SpringMVC.controller;

import com.spring.Mvc.SpringMVC.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(){
        String test = this.userService.handleHello();
        return "hello";
    }
}
