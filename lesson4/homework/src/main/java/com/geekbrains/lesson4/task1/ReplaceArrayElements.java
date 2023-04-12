package com.geekbrains.lesson4.task1;

import java.util.Arrays;

public class ReplaceArrayElements {
       public void replaceArrElem(Object[] arr, int i, int j) {
           Object tmp = arr[i];
           arr[i] = arr[j];
           arr[j] = tmp;
       }
}
