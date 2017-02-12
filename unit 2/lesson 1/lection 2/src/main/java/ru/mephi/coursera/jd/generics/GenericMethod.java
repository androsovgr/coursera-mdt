package ru.mephi.coursera.jd.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    public static <T> List<T> newList(T firstElement) {
        ArrayList<T> list = new ArrayList<>();
        list.add(firstElement);
        return list;
    }

    public static void main(String[] args) {
        List<String> stringList = newList("str");
        System.out.println(stringList.get(0));
    }
}
