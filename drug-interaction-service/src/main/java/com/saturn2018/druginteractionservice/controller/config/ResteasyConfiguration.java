package com.saturn2018.druginteractionservice.controller.config;

import com.saturn2018.druginteractionservice.controller.api.*;
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
        register(UserResource.class);
    }
}
