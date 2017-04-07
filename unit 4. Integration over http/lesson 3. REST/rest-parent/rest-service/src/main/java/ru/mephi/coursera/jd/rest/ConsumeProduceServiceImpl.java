package ru.mephi.coursera.jd.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import ru.mephi.coursera.jd.rest.model.custom.MyModel;
import ru.mephi.coursera.jd.rest.model.json.Person;
import ru.mephi.coursera.jd.rest.model.json.SearchRequest;
import ru.mephi.coursera.jd.rest.model.json.SearchResponse;
import ru.mephi.coursera.jd.rest.model.xml.XmlModel;
import ru.mephi.coursera.jd.rest.model.xml.XmlSearchRequest;
import ru.mephi.coursera.jd.rest.model.xml.XmlSearchResponse;

public class ConsumeProduceServiceImpl implements ConsumeProduceService {

  @Override
  public XmlSearchResponse searchXml(XmlSearchRequest request) {
    List<XmlModel> result = new ArrayList<>();
    for (int i = 0; i < Math.random() * 10; i++) {
      result.add(
          new XmlModel((long) Math.random() * request.getMaxAge() - request.getMinAge(), UUID.randomUUID().toString()));
    }
    return new XmlSearchResponse(result);
  }

  @Override
  public SearchResponse searchJson(SearchRequest request) {
    List<Person> result = new ArrayList<>();
    for (int i = 0; i < Math.random() * 10; i++) {
      result.add(
          new Person((int) Math.random() * request.getMaxAge() - request.getMinAge(), UUID.randomUUID().toString()));
    }
    return new SearchResponse(result);
  }

  @Override
  public MyModel getCustom(MyModel model) {
    return model;
  }

}
