package ru.mephi.coursera.jd.soap.iface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HeaderService {
  @WebMethod
  String doAuth(@WebParam(header = true, name = "login") String login,
      @WebParam(header = true, name = "password") String password,
      @WebParam(name = "data") String data);
}
