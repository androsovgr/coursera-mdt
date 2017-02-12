package ru.mephi.coursera.jd.generics.bounds;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UpperBoundedLimitations {
    public static void main(String[] args) {
        List<Long> longList = new ArrayList<>();
        longList.add(1L);
        List<? extends Number> upperBoundedList = longList;
        List<? extends Serializable> upperUpperBoundedList = upperBoundedList;
        List<Serializable> serialList = upperBoundedList;
        upperBoundedList = upperUpperBoundedList;
        Number n = upperBoundedList.get(0);
        Object o = upperBoundedList.get(0);
        Long l = upperBoundedList.get(0);
        upperBoundedList.add(null);
        upperBoundedList.addAll(n);
    }
}
