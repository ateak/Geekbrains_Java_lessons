package com.geekbrains.lesson3.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Arrays;

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



//        FileOutputStream out = null;
//        try {
//            out = new FileOutputStream("1.txt");
//            out.write(1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (out != null) {
//                    out.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        // другой вариант вышенаписанного, начиная с Java 8
//        try (FileOutputStream out2 = new FileOutputStream("1.txt");
//             FileInputStream in = new FileInputStream("2.txt")) {
//
//        } catch (IOException e) {
//
//        }


        //MyLibMatrixProcessingException
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == 7 || arr[i][j] == 12) {
//                    throw new MyLibMatrixProcessingException(i, j, arr);
//                }
//            }
//        }


        //MyLibVectorProcessingException
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] == 7 || arr[i] == 12) {
                    throw new MyLibVectorProcessingException(i, arr);
                }
            } catch (MyLibVectorProcessingException e) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

//    public static int doSomething() throws FileNotFoundException {
//       try {
//           return 1;
//       } finally {
//           return 2;
//       }
//    }
//
//    public static int sqrt(int n) {
//        if (n < 0) {
//            throw new ArithmeticException("Невозможно взять корень из отрицательного числа");
//        }
//        return n / 2;
//    }
}
