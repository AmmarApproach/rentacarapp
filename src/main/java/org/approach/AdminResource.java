package org.approach;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/admin")
public class AdminResource {
    //admin resources
    //password=admin123
    private static final String CONNECTION_STRING = "jdbc:sqlserver://loaclhost:8080;databaseName=db;username=username;password=admin123";

    @GET
    @RolesAllowed("ADMIN")
    @Produces(MediaType.TEXT_PLAIN)
    public String adminResource() {
        return "admin";
    }
}
