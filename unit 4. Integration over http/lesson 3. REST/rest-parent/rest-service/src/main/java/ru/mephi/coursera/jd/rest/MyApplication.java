package ru.mephi.coursera.jd.rest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class MyApplication extends Application {
  @Override
  public Set<Class<?>> getClasses() {
    return new HashSet<>(Arrays.asList(MyServiceImpl.class, PathServiceImpl.class, HttpMethodsServiceImpl.class,
        ConsumeProduceServiceImpl.class));
  }
}
