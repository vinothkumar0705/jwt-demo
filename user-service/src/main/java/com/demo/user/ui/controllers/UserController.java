package com.demo.user.ui.controllers;

import com.demo.user.ui.model.CreateUserRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    Environment environment;
    @GetMapping(path = "/status/check")
    public String statusCheck(){
        String port =environment.getProperty("local.server.port");
        return "User service working "+port;
    }

    @PostMapping
    public String createUser(@RequestBody CreateUserRequestModel userDetails){
        return "Create user called";
    }
}
