package com.saturn2018.druginteractionservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class Drug {
    private String name;
    private String formalName;
    private String category;
    private String description;
    private Object does;
}
