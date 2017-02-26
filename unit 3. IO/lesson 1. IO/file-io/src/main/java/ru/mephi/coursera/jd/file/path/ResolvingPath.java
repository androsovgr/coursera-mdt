package ru.mephi.coursera.jd.file.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvingPath {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\home\\joe\\foo");
        // Result is C:\home\joe\foo\bar
        System.out.format("%s%n", p1.resolve("bar"));
    }
}
