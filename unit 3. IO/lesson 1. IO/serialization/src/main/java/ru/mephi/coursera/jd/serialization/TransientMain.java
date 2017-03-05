package ru.mephi.coursera.jd.serialization;

import java.util.UUID;

import ru.mephi.coursera.jd.serialization.model.NotSerializableModel;
import ru.mephi.coursera.jd.serialization.model.WithTransientModel;

public class TransientMain {
  public static void main(String[] args) throws Exception {
    WithTransientModel wtm = new WithTransientModel(12,
        new NotSerializableModel(UUID.randomUUID().toString()));
    SerializationBasic.serializeDeserialize(wtm);
  }
}
