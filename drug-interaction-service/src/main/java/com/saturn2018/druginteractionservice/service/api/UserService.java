package com.saturn2018.druginteractionservice.service.api;

import com.saturn2018.druginteractionservice.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getAllUser ();

    User userLogin(User user);

}
