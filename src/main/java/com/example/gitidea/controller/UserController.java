package com.example.gitidea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test1(){
        return "test成功";
    }
}
