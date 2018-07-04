package com.saturn2018.druginteractionservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class Food {
    private int foodKey;
    private String name;
    private String type;
}
