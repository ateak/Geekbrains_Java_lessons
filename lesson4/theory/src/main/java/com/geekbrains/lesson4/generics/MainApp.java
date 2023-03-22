package com.geekbrains.lesson4.generics;

import javax.swing.*;
import java.util.List;


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
//        GenBox<String> strBox = new GenBox<>("Java");
//        GenBox<Integer> intBox1 = new GenBox<>(10);
//        GenBox<Integer> intBox2 = new GenBox<>(20);
//        //не сможем положить сюда что-то кроме Integer, что избавляет нас от дополнительной проверки на соответствие типа
//        intBox1.setObj(55);
//
//        //с использованием дженериков cast не требуется
//        // сам дженерик подставляет тип Integer
//        int sum = intBox1.getObj() + intBox2.getObj();


//        BoxWithNumbers<Integer> intBox = new BoxWithNumbers<>(1,2,3,4);
//        BoxWithNumbers<Integer> intBox2 = new BoxWithNumbers<>(1,2,3,4);
//
//        System.out.println(intBox.average());
//        BoxWithNumbers<Float> floatBox = new BoxWithNumbers<>(1.0f,2.0f,3.0f,4.0f);
//        System.out.println(floatBox.average());
//        System.out.println(intBox.compareAverage(floatBox));
//
//        System.out.println(intBox.getClass().getName());
//
//        GenBox<Number> gbn = new GenBox<>(1);
//        GenBox<Integer> gbi = new GenBox<>(1);
//
//        doSomething1(gbn);
//        doSomething2(gbn);
//        doSomething1(gbi);
//        doSomething2(gbi);

        //вот почему не работает наследование:
        //слева мы указали, что принимаем всех наследников класса Number,
        // а справа пытаемся ограничиться только одним классом Integer. Возникает противоречие.
        //GenBox<Number> gbx = new GenBox<Integer>(123);

//        method1(new int[]{1,2,3,4,5});
//        method2(1,2,3,4,5);

    }

//    public static void method1(int[] arr) {
//
//    }
//    // аргумент переменной длины мб только один, он стоит всегда справа
//    public static void method2(int... arr) {
//
//    }

    //обобщенный метод
//    public static <T> T getFirstElement(List<T> list) {
//        return list.get(0);
//    }



    // в обобщениях не работает наследование
    // сюда можно подать или Number, или любого наследника Number:
    //   public static void doSomething1(GenBox<? extends Number> box) {
    //   }

    // сюда можно подать строго только Number:
    //   public static void doSomething2(GenBox<Number> box) {
    //   }

    // сюда можно подать или Number, или родителя Number:
    //   public static void doSomething3(GenBox<? super Number> box) {
    //   }

}
