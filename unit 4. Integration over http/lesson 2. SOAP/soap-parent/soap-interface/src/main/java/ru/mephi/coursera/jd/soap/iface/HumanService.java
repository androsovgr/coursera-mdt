package ru.mephi.coursera.jd.soap.iface;

import javax.jws.WebService;

@WebService
public interface HumanService {
  SearchResponse searchHuman(SearchRequest request) throws SearchExeption;
}
