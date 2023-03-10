package com.geekbrains.lesson1.homework;

public class DomesticCat extends Animal {
    public static int countCats = 0;

    public DomesticCat(String name) {
        super(name);
        countCats++;
    }

    @Override
    public void run(int len) {
        if (len >= 0 && len <= 200) {
            System.out.println(name + " ran " + len + " meters");
        }
        else {
            System.out.println(name + " couldn't run " + len + " meters");
        }
    }

    @Override
    public void swim(int len) {
        System.out.println(name + " can't swim ");
    }

}