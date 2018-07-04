package com.saturn2018.druginteractionservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class Does {
    private boolean drugPackage;
    private String label;
    private int value;
    private int bestValue;
    private boolean program;
    private int defaultQuantity;
}
