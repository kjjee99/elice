package com.kit.my.elice.controller;

import com.kit.my.elice.dto.Address;
import com.kit.my.elice.entity.UserEntity;
import com.kit.my.elice.repository.UserRepository;
import com.kit.my.elice.service.UserService;
import com.kit.my.elice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserControllerImpl implements UserController{

    @Autowired
    UserServiceImpl service;
    @Autowired
    UserRepository repository;

    @Override
    @PostMapping("/register")
    public String addUser(@RequestBody Map<String, Object> user){
        service.addUser(user);
        return "ok";
    }

}
