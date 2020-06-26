package org.acme;

        import javax.ws.rs.GET;
        import javax.ws.rs.Path;
        import javax.ws.rs.Produces;
        import javax.ws.rs.core.MediaType;

@Path("/main")
public class ExampleResource {

    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @Path("helloQuarkus")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloQuarkus() {
        return "hello Quarkus";
    }
}