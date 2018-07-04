package com.saturn2018.druginteractionservice.service.impl;

import com.saturn2018.druginteractionservice.model.Food;
import com.saturn2018.druginteractionservice.service.api.FoodService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    //fake data
    private List<Food> foods = new ArrayList<>(
            Arrays.asList(new Food( 1,"Apple","F"    ),
                             new Food(2,"Orange", "F")
            )
    );
    public List<Food> getAllFoods () {return foods;}
}
