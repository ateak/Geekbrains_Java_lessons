package com.geekbrains.lesson3.homework;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        ArrayChecker arrayChecker = new ArrayChecker();
        try {
            arrayChecker.handleArray(arr);
            System.out.println("Сумма элементов массива: " + arrayChecker.getSum());
        } catch (MyArrayException e) {
            e.printStackTrace();
        }
    }
}
