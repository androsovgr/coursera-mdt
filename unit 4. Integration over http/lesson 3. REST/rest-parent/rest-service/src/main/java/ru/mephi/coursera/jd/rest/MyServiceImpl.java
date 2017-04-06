package ru.mephi.coursera.jd.rest;

public class MyServiceImpl implements MyService {
  @Override
  public String doGet(String name) {
    return "Hello, " + name + "!";
  }
}
