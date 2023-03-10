package com.geekbrains.lesson1;

public class Dog extends Animal {
    public Dog() {}

    public Dog(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run(int len) {
        if (len <= 500) {
            System.out.println(name + " ran " + len + "meters");
        }
        else {
            System.out.println(name + " couldn't run " + len + "meters");
        }
    }

    @Override
    public void swim(int len) {
        if (len <= 10) {
            System.out.println(name + " swimmed " + len + "meters");
        }
        else {
            System.out.println(name + " couldn't swimmed " + len + "meters");
        }
    }
}
