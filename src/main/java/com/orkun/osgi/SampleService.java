package com.orkun.osgi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

public interface SampleService {

    @GET
    @Path("/foo/{id}/")
    @Produces("application/json")
    String getFoo(@PathParam("id") String id);
}
