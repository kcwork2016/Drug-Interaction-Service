package com.saturn2018.druginteractionservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Chemical {
    public int chemicalKey;
    private String name;
    private String formulaName;
    private String description;
    private String doesUnit;
    private int doesValue;
}
