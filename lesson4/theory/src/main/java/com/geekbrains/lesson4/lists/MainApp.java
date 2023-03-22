package com.geekbrains.lesson4.lists;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("A", "B", "B", "B", "C", "D"));
        System.out.println(arrayList);
        while (arrayList.remove("B"));
        System.out.println(arrayList);
    }
}
