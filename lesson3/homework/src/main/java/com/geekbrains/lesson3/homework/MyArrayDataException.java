package com.geekbrains.lesson3.homework;

public class MyArrayDataException extends MyArrayException {
    private int row;
    private int column;
    private String value;

    public MyArrayDataException(int column, int row, String[][] array) {
        super("Invalid data in [" + column + "; " + row + "]: " + array[column][row]);
        this.row = row;
        this.column = column;
        this.value = array[column][row];
    }
}
