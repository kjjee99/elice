package com.kit.my.elice.controller;


import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface UserController {

    /* 회원가입 */
    String addUser(@RequestBody Map<String, Object> user);
}
