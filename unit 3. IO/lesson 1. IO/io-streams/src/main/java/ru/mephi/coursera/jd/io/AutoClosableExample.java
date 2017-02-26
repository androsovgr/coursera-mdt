package ru.mephi.coursera.jd.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.io.IOUtils;

public class AutoClosableExample {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader r = new InputStreamReader(
                new FileInputStream("E:\\input.txt"), "UTF-8")) {
            IOUtils.copy(r, System.out, "UTF-8");
        }
    }
}
