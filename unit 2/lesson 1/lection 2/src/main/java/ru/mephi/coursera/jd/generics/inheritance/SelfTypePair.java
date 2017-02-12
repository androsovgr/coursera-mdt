package ru.mephi.coursera.jd.generics.inheritance;

import ru.mephi.coursera.jd.generics.Pair;

public class SelfTypePair<T> extends Pair<T, T> {
    public SelfTypePair(T left, T right) {
        super(left, right);
    }
}
