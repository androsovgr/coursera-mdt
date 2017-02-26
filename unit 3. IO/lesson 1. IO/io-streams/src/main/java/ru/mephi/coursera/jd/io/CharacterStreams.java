package ru.mephi.coursera.jd.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;

public class CharacterStreams {
    public static void main(String[] args) throws IOException {
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new StringReader("Строка");
            writer = new OutputStreamWriter(new FileOutputStream("output.txt"), "UTF-8");
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
