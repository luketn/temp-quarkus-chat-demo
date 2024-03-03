package com.mycodefu;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    C3P0 c3p0;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return c3p0.greet();
    }
}
