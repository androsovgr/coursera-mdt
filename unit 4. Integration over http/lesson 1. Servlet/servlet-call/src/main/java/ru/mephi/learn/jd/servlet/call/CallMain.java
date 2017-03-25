package ru.mephi.learn.jd.servlet.call;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class CallMain {
  public static void main(String[] args) throws IOException {
    URL url = new URL("http://localhost:8080/servlet-basics/request-body/");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("POST");
    con.setDoOutput(true);
    try (Writer sw = new OutputStreamWriter(con.getOutputStream(), "UTF-8")) {
      sw.write("My request");
    }
    System.out.println("response code: " + con.getResponseCode());
    BufferedReader r = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
    System.out.println("Response: " + IOUtils.toString(r));
  }
}
