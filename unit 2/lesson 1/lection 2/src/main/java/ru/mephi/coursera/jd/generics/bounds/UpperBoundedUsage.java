package ru.mephi.coursera.jd.generics.bounds;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedUsage {
    public static double geometricMean(List<? extends Number> numbers) {
        double result = 1;
        for (Number n : numbers) {
            result *= n.doubleValue();
        }
        return Math.pow(result, 1 / numbers.size());
    }

    public static void main(String[] args) {
        List<Long> lList = new ArrayList<>();
        List<Integer> iList = new ArrayList<>();
        System.out.println(geometricMean(lList));
        System.out.println(geometricMean(iList));
    }
}
