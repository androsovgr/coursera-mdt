package ru.mephi.coursera.jd.exception.jway;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ru.mephi.coursera.jd.exception.PersonModel;

public class FileParser {

    public void readAndLog() {
        try {
            List<PersonModel> result = read();
            System.out.println("Red from file: " + result);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private List<PersonModel> read() throws IOException {
        List<PersonModel> resultList = new ArrayList<>();
        String nameContainer = null;
        // .....handling other fields
        String ageAsString = readAgeAsString();
        int age = parseStringAsInt(ageAsString);
        resultList.add(new PersonModel(nameContainer, age));
        return resultList;
    }

    private String readAgeAsString() throws IOException {
        // some code
        String redValue = "32a";
        return redValue;
    }

    private int parseStringAsInt(String longAsString) {
        // may fail after some logic
        throw new NumberFormatException();
    }
}
