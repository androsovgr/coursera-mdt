package ru.mephi.coursera.jd.rest.model.xml;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType
public class XmlSearchRequest {

  private long minAge;
  private long maxAge;

  public XmlSearchRequest() {
    super();
  }

  public XmlSearchRequest(long minAge, long maxAge) {
    super();
    this.minAge = minAge;
    this.maxAge = maxAge;
  }

  public long getMinAge() {
    return minAge;
  }

  public void setMinAge(long minAge) {
    this.minAge = minAge;
  }

  public long getMaxAge() {
    return maxAge;
  }

  public void setMaxAge(long maxAge) {
    this.maxAge = maxAge;
  }

}
