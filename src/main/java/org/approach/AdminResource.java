package org.approach;

import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/admin")
@RolesAllowed("ADMIN")
public class AdminResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String adminResource() {
        return "admin";
    }

    @GET
    @Path("/contact")
    @Produces(MediaType.TEXT_PLAIN)
    @PermitAll
    public String adminContact() {
        return "contact of the admin: ...";
    }
}
