package ru.mephi.coursera.jd.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/path-service")
public interface PathService {
  @Path("/hello/{name}")
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  String helloService(@PathParam("name") String name);

  @GET
  @Path("/find/{name}/{age: \\d{1,2}}")
  @Produces(MediaType.TEXT_PLAIN)
  String find(@PathParam("name") String name, @PathParam("age") long age);
}
