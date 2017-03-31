package ru.mephi.coursera.jd.soap;

import java.util.UUID;

import javax.jws.WebService;

import ru.mephi.coursera.jd.soap.iface.HeaderService;

@WebService(endpointInterface = "ru.mephi.coursera.jd.soap.iface.HeaderService", serviceName = "HeaderService")
public class HeaderServiceImpl implements HeaderService {

  @Override
  public String doAuth(String login, String password, String data) {
    System.out.println("Login:" + login + " password: " + password);
    return UUID.randomUUID().toString();
  }

}
