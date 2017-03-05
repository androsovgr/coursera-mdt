package ru.mephi.coursera.jd.serialization.model;

import java.io.IOException;
import java.io.Serializable;

public class CustomSerializable implements Serializable {
  private static final long serialVersionUID = -3782101564610707355L;
  private String string;
  private long l;

  private void writeObject(java.io.ObjectOutputStream out) throws IOException {
    out.writeObject(string);
    out.writeLong(l);
  }

  private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
    string = (String) in.readObject();
    l = in.readLong();
  }

  public CustomSerializable(String string, long l) {
    super();
    this.string = string;
    this.l = l;
  }

  @Override
  public String toString() {
    return "CustomSerializable [string=" + string + ", l=" + l + "]";
  }

}
