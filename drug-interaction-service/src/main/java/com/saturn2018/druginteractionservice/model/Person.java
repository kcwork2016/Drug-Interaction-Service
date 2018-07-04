package com.saturn2018.druginteractionservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    private int personkey;
    private String personId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
}
