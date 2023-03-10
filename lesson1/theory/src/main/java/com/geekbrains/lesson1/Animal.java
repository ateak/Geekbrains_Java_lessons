package com.geekbrains.lesson1;

public abstract class Animal {
    String name;

    public Animal () {
        this.name = "Unknown";
    }
    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int len);
    public abstract void swim(int len);

}
