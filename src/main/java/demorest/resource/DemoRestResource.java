package demorest.resource;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/v1")
@ApplicationScoped
public class DemoRestResource {
    
    @GET
    @Path("/demoget")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response demoGet(){

        System.out.println("--Request is Comming--");
        return Response.ok("Hello World").build();

    }

}
