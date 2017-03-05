package ru.mephi.coursera.jd.serialization.model;

import java.io.Serializable;

public class WithTransientModel implements Serializable {
  private static final long serialVersionUID = -4427661979080857998L;
  private int field1;
  private transient NotSerializableModel field2;

  public WithTransientModel(int field1, NotSerializableModel field2) {
    super();
    this.field1 = field1;
    this.field2 = field2;
  }

  @Override
  public String toString() {
    return "WithTransientModel [field1=" + field1 + ", field2=" + field2 + "]";
  }

  public int getField1() {
    return field1;
  }

  public NotSerializableModel getField2() {
    return field2;
  }

}
