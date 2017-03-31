package ru.mephi.coursera.jd.soap.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ru.mephi.coursera.jd.soap.iface.Human;
import ru.mephi.coursera.jd.soap.iface.HumanService;
import ru.mephi.coursera.jd.soap.iface.SearchExeption;
import ru.mephi.coursera.jd.soap.iface.SearchRequest;
import ru.mephi.coursera.jd.soap.iface.SearchResponse;

public class SoapClientMain {

  public static void main(String[] args) throws MalformedURLException, SearchExeption {
    URL url = new URL("http://localhost:8080/soap-service/HumanService?wsdl");
    QName qName = new QName("http://soap.jd.coursera.mephi.ru/", "HumanService");
    Service service = Service.create(url, qName);
    HumanService hs = service.getPort(HumanService.class);
    SearchResponse result = hs.searchHuman(new SearchRequest(0, 10));
    for (Human human : result.getPeople()) {
      System.out.println(human);
    }
  }
}
