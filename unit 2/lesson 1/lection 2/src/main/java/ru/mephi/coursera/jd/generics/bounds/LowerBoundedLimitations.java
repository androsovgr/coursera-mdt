package ru.mephi.coursera.jd.generics.bounds;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundedLimitations {
public static void main(String[] args) {
    List<Long> longList = new ArrayList<>();
    longList.add(1L);
    List<? super Serializable> lowerLowerBoundedList = new ArrayList<>();
    List<Serializable> serializableList = new ArrayList<>();
    List<? super Number> lowerBoundedList = lowerLowerBoundedList;
    lowerBoundedList = serializableList;
    lowerLowerBoundedList = lowerBoundedList;
    serializableList = lowerBoundedList;
    lowerBoundedList.add(1L);
    lowerBoundedList.add(2);
    Serializable s = "";
    lowerBoundedList.add(s);
}
}
