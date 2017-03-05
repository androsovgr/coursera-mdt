package ru.mephi.coursera.jd.serialization;

import java.util.UUID;

import ru.mephi.coursera.jd.serialization.model.CustomSerializable;

public class CustomSerializeMain {
  public static void main(String[] args) throws Exception {
    CustomSerializable cs = new CustomSerializable(UUID.randomUUID().toString(), 33);
    SerializationBasic.serializeDeserialize(cs);
  }
}
