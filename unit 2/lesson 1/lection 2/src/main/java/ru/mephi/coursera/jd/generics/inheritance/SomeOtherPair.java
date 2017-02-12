package ru.mephi.coursera.jd.generics.inheritance;

import ru.mephi.coursera.jd.generics.Pair;

public class SomeOtherPair<L, R> extends Pair<L, R> {
    public SomeOtherPair(L left, R right) {
        super(left, right);
    }

    public void someUsefulMethod() {

    }
}
