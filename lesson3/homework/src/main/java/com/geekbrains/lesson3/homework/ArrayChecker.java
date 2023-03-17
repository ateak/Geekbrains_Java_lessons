package com.geekbrains.lesson3.homework;

public class ArrayChecker {
    private int column;
    private int row;
    private String value;
    final private int arrLength = 4;

    public ArrayChecker(int column, int row, String value) {
        this.column = column;
        this.row = row;
        this.value = value;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public String getValue() {
        return value;
    }

    public void checkArraySize(String[][] arr) throws MyArrayException {
        try {
            if (arrLength != arr.length) {
                throw new MyArraySizeException();
            }
        } catch (MyArraySizeException e) {
            System.out.println(new MyArraySizeException());
        }

        for (int i = 0; i < arr.length; i++) {
            try {
                if (arrLength != arr[i].length) {
                    throw new MyArraySizeException();
                }
            } catch (MyArraySizeException e) {
                System.out.println(new MyArraySizeException());
            }
        }
    }



}
