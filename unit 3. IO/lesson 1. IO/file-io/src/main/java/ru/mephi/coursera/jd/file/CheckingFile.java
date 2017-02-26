package ru.mephi.coursera.jd.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckingFile {
    public static void main(String[] args) {
        Path path = Paths.get("C:\tmp\file1.txt");
        System.out.println(Files.exists(path));
        System.out.println(Files.isDirectory(path));
        System.out.println(Files.isRegularFile(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));
    }
}
