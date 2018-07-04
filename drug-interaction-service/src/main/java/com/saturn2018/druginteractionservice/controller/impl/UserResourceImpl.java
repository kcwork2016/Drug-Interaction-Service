package com.saturn2018.druginteractionservice.controller.impl;

import com.saturn2018.druginteractionservice.controller.api.UserResource;
import com.saturn2018.druginteractionservice.model.User;
import com.saturn2018.druginteractionservice.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.util.List;

@Resource
public class UserResourceImpl implements UserResource {

    @Autowired
    private UserService userService;

    @Override
    public List<User> getAllUser() { return userService.getAllUser(); }

    @Override
    public void addUser(@NotNull User user) {
    }

    @Override
    public void userLogin(User user) {
    }
}
