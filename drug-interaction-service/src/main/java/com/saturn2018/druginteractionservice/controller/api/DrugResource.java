package com.saturn2018.druginteractionservice.controller.api;

import com.saturn2018.druginteractionservice.model.Drug;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/drugs")
public interface DrugResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Drug> getAllDrugs();
}
