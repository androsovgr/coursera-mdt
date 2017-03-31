package ru.mephi.coursera.jd.soap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.jws.WebService;

import ru.mephi.coursera.jd.soap.iface.Human;
import ru.mephi.coursera.jd.soap.iface.HumanService;
import ru.mephi.coursera.jd.soap.iface.SearchExeption;
import ru.mephi.coursera.jd.soap.iface.SearchRequest;
import ru.mephi.coursera.jd.soap.iface.SearchResponse;

@WebService(serviceName = "HumanService")
public class HumanServiceImpl implements HumanService {

  private static final List<Human> humanStorage = gererate();

  @Override
  public SearchResponse searchHuman(SearchRequest request) throws SearchExeption {
    // ...
    validateRequest(request);
    List<Human> searchResult = humanStorage.stream().filter(h -> (h.getAge() <= request.getMaxAge()))
        .filter(h -> (h.getAge() >= request.getMinAge())).collect(Collectors.toList());
    return new SearchResponse(searchResult);
  }

  private void validateRequest(SearchRequest r) throws SearchExeption {
    if (r.getMaxAge() < 0) {
      throw new SearchExeption("Max age is invalid");
    }
    if (r.getMinAge() < 0) {
      throw new SearchExeption("Min age is invalid");
    }
  }

  public static List<Human> gererate() {
    List<Human> people = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      people.add(new Human(UUID.randomUUID().toString(), (int) (Math.random() * 100)));
    }
    return Collections.unmodifiableList(people);
  }

}
