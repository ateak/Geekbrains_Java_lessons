package com.geekbrains.lesson2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnotherMainApp {
//    static class Inner {
//        int innerValue;
//
//        public Inner(int innerValue) {
//            this.innerValue = innerValue;
//        }
//
//        public void innerMethod() {
//            System.out.println(innerValue);
//            //System.out.println(outerValue);
//        }
//    }
//
//    int outerValue;
//
//    public void outerMethod() {
//        System.out.println(outerValue);
//        //System.out.println(innerValue);
//        //innerMethod();
//        Inner inner = new Inner(10);
//    }

    public static void main(String[] args) {
//        Inner inner = new Inner(10);
//
//        class Point {
//            int x;
//
//            public Point(int x) {
//                this.x = x;
//            }
//
//            public void info() {
//                System.out.println(x);
//            }
//        }
//
//        Point point = new Point(10);

        //анонимный класс
//        Flyable flyable = new Flyable() {
//            @Override
//            public void fly() {
//
//            }
//        };
//        System.out.println(flyable.getClass().getName());

//        Animal animal = new Animal() {
//            @Override
//            void run() {
//
//            }
//
//            @Override
//            void swim() {
//
//            }
//        };

        JButton button1 = new JButton("Btn 1");
        JButton button2 = new JButton("Btn 2");
        JButton button3 = new JButton("Btn 3");

        button1.addActionListener(new Button1Action());
        button2.addActionListener(new Button2Action());

        //создание анонимного класса
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(3);
            }
        });

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(1);
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

        // Runnable - функциональный интерфейс, поэтому можем написать вот так коротко с использованием лямбды
        new Thread(() -> System.out.println(1)).start();

        doSomething(
                (a, b, c)  -> {
                    System.out.println(a + b + c);
                }
        );
    }

    public static void doSomething(MyInterface myInterface) {
        myInterface.sum(1, 1, 1);
    }

}
