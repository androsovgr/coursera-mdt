package ru.mephi.coursera.jd.rest;

import java.util.UUID;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.core.Response;

public class HttpMethodsServiceImpl implements HttpMethodsService {

  @Override
  public String get() {
    return UUID.randomUUID().toString();
  }

  @Override
  public Response head() {
    return Response.status(200).allow(HttpMethod.GET, HttpMethod.POST).build();
  }

  @Override
  public String post(String body) {
    return "Received body:" + body;
  }

}
