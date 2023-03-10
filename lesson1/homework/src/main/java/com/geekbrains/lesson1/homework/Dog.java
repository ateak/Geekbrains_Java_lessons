package com.geekbrains.lesson1.homework;

public class Dog extends Animal {
    public static int countDogs = 0;
    public Dog(String name) {
        super(name);
        countDogs++;
    }

    @Override
    public void run(int len) {
        if (len >= 0 && len <= 500) {
            System.out.println(name + " ran " + len + " meters");
        }
        else {
            System.out.println(name + " couldn't run " + len + " meters");
        }
    }

    @Override
    public void swim(int len) {
        if (len >= 0 && len <= 10) {
            System.out.println(name + " swimmed " + len + " meters");
        }
        else {
            System.out.println(name + " couldn't swimmed " + len + " meters");
        }
    }
}
