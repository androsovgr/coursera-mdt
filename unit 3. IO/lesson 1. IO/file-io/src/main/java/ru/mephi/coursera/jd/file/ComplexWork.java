package ru.mephi.coursera.jd.file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

public class ComplexWork {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("E:\\tmp");
        Files.createDirectories(dir);
        Path path = dir.resolve(UUID.randomUUID().toString() + ".txt");
        Files.createFile(path);
        try (OutputStreamWriter wr = new OutputStreamWriter(
                new BufferedOutputStream(new FileOutputStream(path.toFile())), "UTF-8")) {
            wr.write("Some text");
            wr.write(System.lineSeparator());
            wr.write(UUID.randomUUID().toString());
        }
        Path copiedPath = Files.copy(path, Paths.get("E:\\tmp\\newFile1.txt"),
                StandardCopyOption.REPLACE_EXISTING);
        Files.move(path, Paths.get("E:\\tmp\\newFile2.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.delete(copiedPath);
    }
}
