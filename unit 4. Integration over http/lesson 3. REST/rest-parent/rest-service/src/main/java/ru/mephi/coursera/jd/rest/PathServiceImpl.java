package ru.mephi.coursera.jd.rest;

public class PathServiceImpl implements PathService {
  @Override
  public String helloService(String name) {
    return "Hello, " + name + "!";
  }

  @Override
  public String find(String name, long age) {
    return String.format("Total founded for name=%s and age=%d: %d", name, age, (long) (Math.random() * 100));
  }
}
