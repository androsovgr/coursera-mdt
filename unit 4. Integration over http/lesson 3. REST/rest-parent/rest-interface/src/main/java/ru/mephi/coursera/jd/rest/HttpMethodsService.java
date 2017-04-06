package ru.mephi.coursera.jd.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/http-methods")
public interface HttpMethodsService {
  @GET
  @Path("/get-head")
  @Produces(MediaType.TEXT_PLAIN)
  String get();

  @HEAD
  @Path("/get-head")
  Response head();

  @POST
  @Path("/post")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.TEXT_PLAIN)
  String post(String body);
}
