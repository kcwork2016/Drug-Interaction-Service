package com.saturn2018.druginteractionservice.controller.api;

import com.saturn2018.druginteractionservice.model.Food;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/foods")
public interface FoodResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Food> getAllFood();
}
