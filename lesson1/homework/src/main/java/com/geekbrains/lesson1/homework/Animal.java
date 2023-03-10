package com.geekbrains.lesson1.homework;

public abstract class Animal {
    String name;

    protected Animal () {
        this.name = "Unknown";
    }
    protected Animal(String name) {
        this.name = name;
    }

    protected abstract void run(int len);
    protected abstract void swim(int len);

}
