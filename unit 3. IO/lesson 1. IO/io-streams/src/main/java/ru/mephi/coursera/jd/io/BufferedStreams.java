package ru.mephi.coursera.jd.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreams {
    public static void main(String[] args) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream("E:\\input.txt"));
            out = new BufferedOutputStream(new FileOutputStream("E:\\output.txt"));
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            out.flush();
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
