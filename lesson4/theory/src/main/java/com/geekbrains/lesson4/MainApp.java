package com.geekbrains.lesson4;

import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
//        SimpleBox intBox1 = new SimpleBox(10);
//        SimpleBox intBox2 = new SimpleBox(20);
//        //...
//        //intBox1.setObj("Java");
//        //...
//        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer) {
//            int sum = (Integer)intBox1.getObj() + (Integer)intBox2.getObj();
//            System.out.println("sum: " + sum);
//        } else {
//            System.out.println("error");
//        }

        //используем дженерик вместо вышеописанного способа
        //для объекта strBox тип Т стал String, а для intBox тип Т стал Integer
        //каждый конструктор ожидает свой тип на вход
        GenBox<String> strBox = new GenBox<>("Java");
        GenBox<Integer> intBox1 = new GenBox<>(10);
        GenBox<Integer> intBox2 = new GenBox<>(20);
        //не сможем положить сюда что-то кроме Integer, что избавляет нас от дополнительной проверки на соответствие типа
        intBox1.setObj(55);

        //с использованием дженериков cast не требуется
        // сам дженерик подставляет тип Integer
        int sum = intBox1.getObj() + intBox2.getObj();



    }
}
