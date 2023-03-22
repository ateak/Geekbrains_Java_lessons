package com.geekbrains.lesson3.exceptions;

import java.io.FileOutputStream;
import java.io.IOException;

public class ReportMaker {
    public static void makePDFReport(String path, String data) {
        try {
            FileOutputStream out = new FileOutputStream("1.txt");
            out.write(data.getBytes());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
