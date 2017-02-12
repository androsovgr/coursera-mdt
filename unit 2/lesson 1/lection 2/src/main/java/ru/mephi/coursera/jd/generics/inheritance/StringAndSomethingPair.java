package ru.mephi.coursera.jd.generics.inheritance;

import ru.mephi.coursera.jd.generics.Pair;

public class StringAndSomethingPair<T> extends Pair<String, T> {
    public StringAndSomethingPair(String left, T right) {
        super(left, right);
    }
}
