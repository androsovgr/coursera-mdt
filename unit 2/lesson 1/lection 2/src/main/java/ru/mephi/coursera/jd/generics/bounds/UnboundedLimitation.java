package ru.mephi.coursera.jd.generics.bounds;

import java.util.ArrayList;
import java.util.List;

public class UnboundedLimitation {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("someString");
        List<?> unboundedList = stringList;
        Object o = unboundedList.get(0);
        unboundedList.add(null);
        unboundedList.add("someString");
    }
}
