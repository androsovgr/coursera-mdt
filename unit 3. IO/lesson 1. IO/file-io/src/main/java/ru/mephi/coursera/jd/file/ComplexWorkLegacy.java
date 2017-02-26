package ru.mephi.coursera.jd.file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

public class ComplexWorkLegacy {
    public static void main(String[] args) throws IOException {
        File dir = new File("E:\\tmp");
        dir.mkdirs();
        File file = new File(dir,
                UUID.randomUUID().toString() + ".txt");
        file.createNewFile();
        try (OutputStreamWriter wr = new OutputStreamWriter(
                new BufferedOutputStream(
                        new FileOutputStream(file)), "UTF-8")) {
            wr.write("Some text");
            wr.write(System.lineSeparator());
            wr.write(UUID.randomUUID().toString());
        }
        File copiedPath = new File("E:\\tmp\\newFile1.txt");
        FileUtils.copyFile(file, copiedPath);
        file.renameTo(new File("E:\\tmp\\newFile2.txt"));
        copiedPath.delete();
    }
}
