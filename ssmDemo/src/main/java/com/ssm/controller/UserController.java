package com.ssm.controller;

import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {


    @Resource
    UserService userService;

    @RequestMapping("/hello")
    public String hello(Model model){
        System.out.println("user");
        model.addAttribute("testModel","test Model success");

        User user = userService.findUserById(1);
        System.out.println("username = "+ user.getUsername());
        System.out.println("id = "+ user.getId());
        System.out.println("age = "+ user.getAge());
        model.addAttribute("user",user);
        return "hello";
    }
}
