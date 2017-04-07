package ru.mephi.coursera.jd.rest.model.json;

public class SearchRequest {
  private int minAge;
  private int maxAge;

  @Override
  public String toString() {
    return "SearchRequest [minAge=" + minAge + ", maxAge=" + maxAge + "]";
  }

  public SearchRequest() {
    super();
  }

  public SearchRequest(int minAge, int maxAge) {
    super();
    this.minAge = minAge;
    this.maxAge = maxAge;
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
