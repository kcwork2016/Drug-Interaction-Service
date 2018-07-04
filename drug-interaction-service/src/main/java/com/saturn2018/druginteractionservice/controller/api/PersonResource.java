package com.saturn2018.druginteractionservice.controller.api;

import com.saturn2018.druginteractionservice.model.Person;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("persons")
public interface PersonResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Person> getAllPerson();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    void addPerson(
            @NotNull
                Person person);

    @DELETE
    @Path("/{personKey}")
    @Produces(MediaType.APPLICATION_JSON)
    void deletePerson(
            @NotNull
            @PathVariable("personKey")
            String personKey);
}
