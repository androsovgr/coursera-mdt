package ru.mephi.coursera.jd.generics;

import java.util.ArrayList;
import java.util.List;

public class WithGenerics {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Some string");
        String str = stringList.get(0);
        stringList.add(1L);
        Long l = stringList.get(1);
    }
}
