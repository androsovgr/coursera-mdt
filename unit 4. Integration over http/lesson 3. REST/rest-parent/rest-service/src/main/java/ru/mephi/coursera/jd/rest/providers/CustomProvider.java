package ru.mephi.coursera.jd.rest.providers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Scanner;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import ru.mephi.coursera.jd.rest.model.custom.MyModel;

@Consumes("application/custom")
@Produces("application/custom")
@Provider
public class CustomProvider implements MessageBodyReader<MyModel>, MessageBodyWriter<MyModel> {
  @Override
  public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
    return type.equals(MyModel.class);
  }

  @Override
  public MyModel readFrom(Class<MyModel> type, Type genericType, Annotation[] annotations, MediaType mediaType,
      MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
      throws IOException, WebApplicationException {
    try (Scanner sc = new Scanner(entityStream, "UTF-8")) {
      return new MyModel(sc.nextLong(), sc.next());
    }
  }

  @Override
  public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
    return isReadable(type, genericType, annotations, mediaType);
  }

  @Override
  public long getSize(MyModel t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
    return -1;
  }

  @Override
  public void writeTo(MyModel t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
      MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
      throws IOException, WebApplicationException {
    try (OutputStreamWriter wr = new OutputStreamWriter(entityStream, "UTF-8")) {
      wr.write(t.getField1() + " " + t.getField2());
    }
  }
}
