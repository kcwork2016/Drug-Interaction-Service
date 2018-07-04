package com.saturn2018.druginteractionservice.controller.api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/demo")
public interface DemoResource {

    @GET
    String getStartTest();
}
