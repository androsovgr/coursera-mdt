package ru.mephi.coursera.jd.rest.model.json;

import java.util.List;

public class SearchResponse {
  private List<Person> result;

  public SearchResponse() {
    super();
  }

  @Override
  public String toString() {
    return "SearchResponse [result=" + result + "]";
  }

  public SearchResponse(List<Person> result) {
    super();
    this.result = result;
  }

  public List<Person> getResult() {
    return result;
  }

  public void setResult(List<Person> result) {
    this.result = result;
  }

}
