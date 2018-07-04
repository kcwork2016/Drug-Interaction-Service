package com.saturn2018.druginteractionservice.controller.api;

import com.saturn2018.druginteractionservice.model.User;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/login")
public interface UserResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<User> getAllUser(
    );

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    void addUser(
            @NotNull
                User user);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    void userLogin(
            User user
    );
}
