package com.geekbrains.lesson3.exceptions;

public class MyLibVectorProcessingException extends MyLibException {
    private int index;
    private int value;


    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }

    public MyLibVectorProcessingException(int index, int[] array) {
        super("Invalid data in [" + index + "]: " + array[index]);
        this.index = index;
        this.value = array[index];
    }

}
