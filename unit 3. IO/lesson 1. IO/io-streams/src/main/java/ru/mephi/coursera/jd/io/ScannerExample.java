package ru.mephi.coursera.jd.io;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws IOException {
        double sum = 0;
        try (Scanner s = new Scanner(
                ScannerExample.class.getResourceAsStream("/numbers.txt"),
                "UTF-8")) {
            s.useDelimiter(", ");
            while (s.hasNext()) {
                if (s.hasNextDouble()) {
                    double next = s.nextDouble();
                    System.out.println("Read: " + next);
                    sum += next;
                } else {
                    System.out.println("Skipped: " + s.next());
                }
            }
        }
        System.out.println("Total: " + sum);
    }
}
