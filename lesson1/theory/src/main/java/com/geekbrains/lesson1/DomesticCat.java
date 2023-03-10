package com.geekbrains.lesson1;

public class DomesticCat extends Animal {

    public DomesticCat(String name) {
        super(name);
    }

        @Override
        public void run(int len) {
            if (len <= 200) {
                System.out.println(name + " ran " + len + "meters");
            }
            else {
                System.out.println(name + " couldn't run " + len + "meters");
            }
        }

        @Override
        public void swim(int len) {
            System.out.println(name + " can't swim ");
        }

}
