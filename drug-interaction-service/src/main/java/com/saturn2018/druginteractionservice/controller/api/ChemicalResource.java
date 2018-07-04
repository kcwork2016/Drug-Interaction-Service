package com.saturn2018.druginteractionservice.controller.api;

import com.saturn2018.druginteractionservice.model.Chemical;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/chemicals")
public interface ChemicalResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Chemical>getAllChemicals();
}
