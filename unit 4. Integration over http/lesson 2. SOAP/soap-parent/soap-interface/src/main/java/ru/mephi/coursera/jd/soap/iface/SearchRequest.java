package ru.mephi.coursera.jd.soap.iface;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType
public class SearchRequest {

  private int minAge;
  private int maxAge;

  public SearchRequest() {
    super();
  }

  public SearchRequest(int minAge, int maxAge) {
    super();
    this.minAge = minAge;
    this.maxAge = maxAge;
  }

  @Override
  public String toString() {
    return "SearchRequest [minAge=" + minAge + ", maxAge=" + maxAge + "]";
  }

  public int getMinAge() {
    return minAge;
  }

  public void setMinAge(int minAge) {
    this.minAge = minAge;
  }

  public int getMaxAge() {
    return maxAge;
  }

  public void setMaxAge(int maxAge) {
    this.maxAge = maxAge;
  }

}
