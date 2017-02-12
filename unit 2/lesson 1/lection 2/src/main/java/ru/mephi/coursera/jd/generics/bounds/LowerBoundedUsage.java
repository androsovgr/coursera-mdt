package ru.mephi.coursera.jd.generics.bounds;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LowerBoundedUsage {
    public static <T> T getMax(List<T> list, Comparator<? super T> comp) {
        if (list.size() == 0) {
            throw new IllegalArgumentException();
        }
        T currentMax = list.get(0);
        for (T t : list) {
            if (comp.compare(t, currentMax) > 0) {
                currentMax = t;
            }
        }
        return currentMax;
    }

    public static void main(String[] args) {
        List<String> sList = Arrays.asList("str1", "string2");
        List<Integer> iList = Arrays.asList(1,2,3);
        System.out.println(getMax(sList, new StringLengthComparator()));
        System.out.println(getMax(sList, new ByHashcodeComparator()));
        System.out.println(getMax(iList, new ByHashcodeComparator()));
    }

    public static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }

    public static class ByHashcodeComparator implements Comparator<Object> {
        @Override
        public int compare(Object o1, Object o2) {
            return o1.hashCode() - o2.hashCode();
        }
    }
}
