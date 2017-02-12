package ru.mephi.coursera.jd;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

public class MainClass {
    public static void main(String[] args) {
        String str = Math.random() > 0.5 ? null : UUID.randomUUID().toString();
        System.out.println(StringUtils.capitalize(str));
    }
}
