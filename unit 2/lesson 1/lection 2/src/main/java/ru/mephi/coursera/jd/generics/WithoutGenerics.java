package ru.mephi.coursera.jd.generics;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {
    public static void main(String[] args) {
        List stringList = new ArrayList();
        stringList.add("someString");
        stringList.add(1L);
        String s = (String) stringList.get(1);
    }
}
