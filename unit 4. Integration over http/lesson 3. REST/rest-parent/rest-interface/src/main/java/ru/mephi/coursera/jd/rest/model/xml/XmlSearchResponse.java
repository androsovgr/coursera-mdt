package ru.mephi.coursera.jd.rest.model.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType
public class XmlSearchResponse {
  private List<XmlModel> result;

  public XmlSearchResponse() {
    super();
  }

  public XmlSearchResponse(List<XmlModel> result) {
    super();
    this.result = result;
  }

  public List<XmlModel> getResult() {
    return result;
  }

  public void setResult(List<XmlModel> result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "SearchResponse [result=" + result + "]";
  }

}
