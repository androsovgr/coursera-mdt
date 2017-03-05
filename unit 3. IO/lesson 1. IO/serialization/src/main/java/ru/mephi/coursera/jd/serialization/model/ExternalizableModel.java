package ru.mephi.coursera.jd.serialization.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableModel implements Externalizable {
  private static final long serialVersionUID = -3782101564610707355L;
  private String string;
  private long l;

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(string);
    out.writeLong(l);
  }

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    string = (String) in.readObject();
    l = in.readLong();
  }

  public ExternalizableModel(String string, long l) {
    super();
    this.string = string;
    this.l = l;
  }

  public ExternalizableModel() {
    super();
  }

  @Override
  public String toString() {
    return "ExternalizableModel [string=" + string + ", l=" + l + "]";
  }

}
