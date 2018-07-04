package com.saturn2018.druginteractionservice.model;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class DrugQuantity {
    private String label;
    private int value;
}
