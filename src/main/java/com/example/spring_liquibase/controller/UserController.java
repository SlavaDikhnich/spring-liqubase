package com.example.spring_liquibase.controller;

import com.example.spring_liquibase.dto.UserDto;
import com.example.spring_liquibase.model.User;
import com.example.spring_liquibase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "create", method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public User create(@RequestBody UserDto dto) {
        return userService.save(dto);
    }

    @RequestMapping(value = "getAll", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Iterable<User> getAll() {
        return userService.getAll();
    }
}
