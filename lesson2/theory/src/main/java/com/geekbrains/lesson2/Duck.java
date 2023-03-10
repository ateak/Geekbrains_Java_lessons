package com.geekbrains.lesson2;

public class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Утка летит");
    }
    @Override
    public void swim() {
        System.out.println(2);
    }
}
