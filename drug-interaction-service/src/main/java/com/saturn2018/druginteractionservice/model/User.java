package com.saturn2018.druginteractionservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String userKey;
    private String username;
    private String password;
}
