package com.geekbrains.lesson4.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayBox <T> {
    private T[] array;

    public ArrayBox(T... array) {
        this.array = array;
    }

    public List<T> arrayToArrayList()
    {
        List<T> listFromArray = new ArrayList<>();
        Collections.addAll(listFromArray, array);
        return listFromArray;
    }

}
