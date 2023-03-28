package com.geekbrains.lesson4.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Human", "Robot", "Cat"};
        ReplaceArrayElements obj = new ReplaceArrayElements();
        obj.replaceArrElem(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}
