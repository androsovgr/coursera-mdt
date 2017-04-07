package ru.mephi.coursera.jd.rest.model.custom;

public class MyModel {
  private long field1;
  private String field2;

  @Override
  public String toString() {
    return "MyModel [field1=" + field1 + ", field2=" + field2 + "]";
  }

  public long getField1() {
    return field1;
  }

  public void setField1(long field1) {
    this.field1 = field1;
  }

  public String getField2() {
    return field2;
  }

  public void setField2(String field2) {
    this.field2 = field2;
  }

  public MyModel() {
    super();
  }

  public MyModel(long field1, String field2) {
    super();
    this.field1 = field1;
    this.field2 = field2;
  }

}
