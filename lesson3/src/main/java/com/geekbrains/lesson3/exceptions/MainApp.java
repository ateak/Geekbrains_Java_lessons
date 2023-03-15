package com.geekbrains.lesson3.exceptions;

import java.io.IOException;
import java.net.ServerSocket;

public class MainApp {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
       try {
           serverSocket = new ServerSocket(8189);

       } catch (IOException e) {
           e.printStackTrace();
           try {
               serverSocket.close();
           } catch (IOException e1) {
               e1.printStackTrace();
           }
       }
        System.out.println(3);
        //a();
    }
    public static void a() {
        b();
    }
    public static void b() {
        int x = 10 / 0;
    }
}
