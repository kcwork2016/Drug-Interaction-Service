package com.saturn2018.druginteractionservice.controller.config;

import com.saturn2018.druginteractionservice.controller.api.ChemicalResource;
import com.saturn2018.druginteractionservice.controller.api.DemoResource;
import com.saturn2018.druginteractionservice.controller.api.DrugResource;
import com.saturn2018.druginteractionservice.controller.api.FoodResource;
import com.saturn2018.druginteractionservice.controller.api.PersonResource;
import com.saturn2018.druginteractionservice.controller.api.UserResource;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class ResteasyConfiguration extends ResourceConfig {

    public ResteasyConfiguration() {
        register(ChemicalResource.class);
        register(DemoResource.class);
        register(DrugResource.class);
        register(FoodResource.class);
        register(PersonResource.class);
     //   register(UserResource.class);
    }
}
