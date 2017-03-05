package ru.mephi.coursera.jd.serialization.model;

public class NotSerializableModel {
  private final String field;

  @Override
  public String toString() {
    return "NotSerializableModel [field=" + field + "]";
  }

  public NotSerializableModel(String field) {
    super();
    this.field = field;
  }

  public String getField() {
    return field;
  }

}
