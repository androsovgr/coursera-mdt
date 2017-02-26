package ru.mephi.coursera.jd.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

import java.io.IOException;

public class CopyOption {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\tmp\file1.txt");
        Path target = Paths.get("C:\\tmp\file2.txt");
        Files.move(source, target, REPLACE_EXISTING, ATOMIC_MOVE);
    }
}
