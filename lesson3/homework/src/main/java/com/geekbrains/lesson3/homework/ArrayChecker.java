package com.geekbrains.lesson3.homework;

public class ArrayChecker {
    final private int arrLength = 4;
    final private int[][] intArr = new int[4][4];
    private int sum;

    public ArrayChecker() {}

    public int getSum() {
        return sum;
    }

    public void handleArray(String[][] arr) throws MyArrayException {
        if (arr.length != arrLength) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arrLength) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    intArr[i][j] = Integer.valueOf(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, arr);
                }
                sum += intArr[i][j];
            }
        }
    }
}
