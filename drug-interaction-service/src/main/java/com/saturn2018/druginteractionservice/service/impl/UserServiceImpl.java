package com.saturn2018.druginteractionservice.service.impl;

import com.saturn2018.druginteractionservice.model.User;
import com.saturn2018.druginteractionservice.service.api.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    //fake data
    private List<User> users = new ArrayList<>(
            Arrays.asList(new User("1","11","001"),
                    new User("2","22","002")
            )
    );

    @Override
    public List<User> getAllUser() {return users; }

    @Override
    public void addUser(User user) {}

    @Override
    public User userLogin(User user) {return null;}
}
