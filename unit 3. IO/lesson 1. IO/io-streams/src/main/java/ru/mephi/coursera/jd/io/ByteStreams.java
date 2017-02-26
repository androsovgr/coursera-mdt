package ru.mephi.coursera.jd.io;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreams {
    public static void main(String[] args) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            byte[] byteArray = { 12, 127, 41, 1, 4, 0, -128 };
            in = new ByteArrayInputStream(byteArray);
            out = new FileOutputStream("E:\\output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
