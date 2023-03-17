package com.geekbrains.lesson3.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

public class MainApp {
    public static void main(String[] args) {
//        ServerSocket serverSocket = null;
//       try {
//           serverSocket = new ServerSocket(8189);
//
//       } catch (IOException e) {
//           e.printStackTrace();
//           try {
//               serverSocket.close();
//           } catch (IOException e1) {
//               e1.printStackTrace();
//           }
//       }

        //  конструктор класса предупреждает что здесь может возни кнуть исключение
        //поэтому если его не обработать, код не запустится
//        int x = 10 / 0;
//        try {
//            FileOutputStream out = new FileOutputStream("1.txt");
//        } catch (FileNotFoundException e) {
//           e.printStackTrace();
//        }

        //ReportMaker.makePDFReport("1.txt", "gfdhgjfjhgm");

//        try {
//            int x = 10 / 0;
//        } catch (NullPointerException e) {
//            System.out.println("Exception");
//        } finally {
//            System.out.println(1);
//        }
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("1.txt");
            out.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int doSomething() throws FileNotFoundException {
       try {
           return 1;
       } finally {
           return 2;
       }
    }

    public static int sqrt(int n) {
        if (n < 0) {
            throw new ArithmeticException("Невозможно взять корень из отрицательного числа");
        }
        return n / 2;
    }
}
