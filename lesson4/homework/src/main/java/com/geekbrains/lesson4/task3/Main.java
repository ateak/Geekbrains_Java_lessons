package com.geekbrains.lesson4.task3;

public class Main {
    public static void main(String[] args) {
        Apple justApple = new Apple(1.0f);
        Apple greenApple = new Apple(2.3f);
        Apple redApple = new Apple(0.9f);
        Apple yellowApple = new Apple(1.4f);

        Orange orange = new Orange(3.3f);
        Orange morroccoOrange = new Orange(1.5f);
        Orange redOrange = new Orange(2.7f);

        Box box1 = new Box();
        box1.addFruitToBox(justApple);
        box1.addFruitToBox(greenApple);
        box1.addFruitToBox(orange);
    }
}
