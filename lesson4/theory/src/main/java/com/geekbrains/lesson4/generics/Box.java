package com.geekbrains.lesson4.generics;
//обобщенный интерфейс Comparable
public class Box implements Comparable<Box> {
    private int size;

    public Box(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(Box o) {
        return this.size - o.size;
    }
}
