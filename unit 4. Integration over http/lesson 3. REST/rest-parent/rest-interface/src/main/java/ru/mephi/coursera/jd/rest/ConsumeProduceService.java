package ru.mephi.coursera.jd.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ru.mephi.coursera.jd.rest.model.custom.MyModel;
import ru.mephi.coursera.jd.rest.model.json.SearchRequest;
import ru.mephi.coursera.jd.rest.model.json.SearchResponse;
import ru.mephi.coursera.jd.rest.model.xml.XmlSearchRequest;
import ru.mephi.coursera.jd.rest.model.xml.XmlSearchResponse;

@Path("/consume-produce")
public interface ConsumeProduceService {
  @Path("/xml")
  @Consumes(MediaType.APPLICATION_XML)
  @Produces(MediaType.APPLICATION_XML)
  @POST
  XmlSearchResponse searchXml(XmlSearchRequest request);

  @Path("/json")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @POST
  SearchResponse searchJson(SearchRequest request);

  @POST
  @Path("/custom")
  @Produces("application/custom")
  @Consumes("application/custom")
  MyModel getCustom(MyModel model);
}
