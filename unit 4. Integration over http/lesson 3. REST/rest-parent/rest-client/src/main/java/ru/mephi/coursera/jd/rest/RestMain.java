package ru.mephi.coursera.jd.rest;

import java.util.Arrays;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import ru.mephi.coursera.jd.rest.model.json.SearchRequest;
import ru.mephi.coursera.jd.rest.model.json.SearchResponse;

public class RestMain {
  public static void main(String[] args) {
    ConsumeProduceService cps = JAXRSClientFactory.create("http://localhost:8080/rest-service",
        ConsumeProduceService.class, Arrays.asList(new JacksonJsonProvider()), true);
    SearchResponse response = cps.searchJson(new SearchRequest(1, 100));
    System.out.println(response);
  }
}
