package ru.mephi.coursera.jd.generics.inheritance;

import ru.mephi.coursera.jd.generics.Pair;

public class StringPair extends Pair<String, String> {
    public StringPair(String left, String right) {
        super(left, right);
    }
}
