package ru.mephi.coursera.jd.soap.iface;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType
public class SearchResponse {

  private List<Human> people;

  public SearchResponse(List<Human> people) {
    super();
    this.people = people;
  }

  public SearchResponse() {
    super();
  }

  @Override
  public String toString() {
    return "SearchResponse [people=" + people + "]";
  }

  public List<Human> getPeople() {
    return people;
  }

  public void setPeople(List<Human> people) {
    this.people = people;
  }

}
