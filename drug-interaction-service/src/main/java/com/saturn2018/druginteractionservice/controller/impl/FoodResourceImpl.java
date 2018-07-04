package com.saturn2018.druginteractionservice.controller.impl;

import com.saturn2018.druginteractionservice.controller.api.FoodResource;
import com.saturn2018.druginteractionservice.service.api.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.saturn2018.druginteractionservice.model.Food;

import java.util.List;

@Component
public class FoodResourceImpl implements FoodResource {

    @Autowired
    private FoodService foodService;

    @Override
    public List<Food> getAllFood() { return foodService.getAllFoods(); }
}
