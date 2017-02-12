package ru.mephi.coursera.jd.generics.bounds;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UnboundedExample {
    public static boolean checkAllEquals(List<?> l) {
        if (l.size() < 1) {
            return true;
        }
        Object first = l.get(0);
        for (Object o : l) {
            if (!Objects.equals(o, first)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        List<Object> oList = new ArrayList<>();
        System.out.println(checkAllEquals(oList));
        System.out.println(checkAllEquals(sList));
    }
}
