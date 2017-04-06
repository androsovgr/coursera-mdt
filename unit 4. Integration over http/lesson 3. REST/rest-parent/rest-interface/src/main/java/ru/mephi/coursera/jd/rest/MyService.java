package ru.mephi.coursera.jd.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/my-service")
public interface MyService {
  @Path("/doGet")
  @GET
  @Produces("text/plain")
  String doGet(@QueryParam("name") String name);
}
