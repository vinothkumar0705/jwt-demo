package com.demo.user.ui.controllers;

import com.demo.user.service.UserService;
import com.demo.user.shared.UserDTO;
import com.demo.user.ui.model.CreateUserRequestModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    Environment environment;

    @Autowired
    UserService userService;

    @GetMapping(path = "/status/check")
    public String statusCheck(){
        String port =environment.getProperty("local.server.port");
        return "User service working "+port;
    }

    @PostMapping
    public String createUser(@Valid @RequestBody CreateUserRequestModel userDetails){

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDTO userDTO = modelMapper.map(userDetails, UserDTO.class);
        userService.createUser(userDTO);

        return "Create user called";
    }
}
