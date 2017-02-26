package ru.mephi.coursera.jd.file.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativePath {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/joe");
        Path p3 = Paths.get("/home/sally/bar");
        // Result is ..\sally\bar
        System.out.println(p1.relativize(p3));
        // Result is ..\..\joe
        System.out.println(p3.relativize(p1));
    }
}
