package ru.mephi.coursera.jd.exception.cway;

import java.util.ArrayList;
import java.util.List;

import ru.mephi.coursera.jd.exception.PersonModel;

public class FileParser {

    public void readAndLog() {
        Container<List<PersonModel>> result = new Container<>();
        if (!read(result)) {
            System.err.println("Some trobles when read from file");
        } else {
            System.out.println("Red from file: " + result.getContent());
        }
    }

    private boolean read(Container<List<PersonModel>> result) {
        List<PersonModel> resultList = new ArrayList<>();
        Container<String> nameContainer = new Container<>();
        // .....handling other fields
        Container<String> ageAsStringContainer = new Container<>();
        if (!readAgeAsString(ageAsStringContainer)) {
            return false;
        }
        Container<Integer> ageContainer = new Container<>();
        if (!parseStringAsInt(ageContainer, ageAsStringContainer.getContent())) {
            return false;
        }
        resultList.add(new PersonModel(nameContainer.getContent(), ageContainer.getContent()));
        result.setContent(resultList);
        return true;
    }

    private boolean readAgeAsString(Container<String> container) {
        // some code
        String redValue = "32a";
        container.setContent(redValue);
        return true;
    }

    private boolean parseStringAsInt(Container<Integer> result, String longAsString) {
        // may fail after some logic
        return false;
    }
}
