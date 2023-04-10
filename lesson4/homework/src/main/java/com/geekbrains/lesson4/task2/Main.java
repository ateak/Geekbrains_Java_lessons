package com.geekbrains.lesson4.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayBox<String> strBox = new ArrayBox<>("Java", "Kotlin", "C");
        ArrayBox<Integer> intBox = new ArrayBox<>(10, 20, 30);

        List strList = strBox.arrayToArrayList();
        List intList = intBox.arrayToArrayList();

        printList(strList);
        printList(intList);
    }

    private static <T> void printList(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
