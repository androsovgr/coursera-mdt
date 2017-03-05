package ru.mephi.coursera.jd.serialization;

import ru.mephi.coursera.jd.serialization.model.ExternalizableModel;

public class ExternizableMain {
  public static void main(String[] args) throws Exception {
    ExternalizableModel em = new ExternalizableModel("str", 9);
    SerializationBasic.serializeDeserialize(em);
  }
}
