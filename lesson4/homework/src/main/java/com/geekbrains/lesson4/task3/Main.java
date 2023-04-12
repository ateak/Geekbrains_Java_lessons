package com.geekbrains.lesson4.task3;

public class Main {
    public static void main(String[] args) {
        Apple justApple = new Apple(1.0f);
        Apple greenApple = new Apple(2.3f);
        Apple redApple = new Apple(0.9f);
        Apple yellowApple = new Apple(1.4f);

        Orange orange = new Orange(3.3f);
        Orange smallOrange = new Orange(1.5f);
        Orange redOrange = new Orange(2.7f);
        Orange tastyOrange = new Orange(1.4f);

        Box<Apple> box1 = new Box();
        box1.addFruitToBox(justApple);
        box1.addFruitToBox(greenApple);
        box1.addFruitToBox(redApple);
        box1.addFruitToBox(yellowApple);

        Box<Orange> box2 = new Box();
        box2.addFruitToBox(orange);
        box2.addFruitToBox(smallOrange);
        box2.addFruitToBox(redOrange);

        Box<Orange> box3 = new Box<>();
        box3.addFruitToBox(tastyOrange);

        Box<Apple> box4 = new Box<>();
        box4.addFruitToBox(yellowApple);


        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());
        System.out.println(box4.getWeight());



        if (box1.compare(box2)) {
            System.out.println("boxes have the same weight");
        }
        else {
            System.out.println("boxes aren't equal");
        }

        if (box3.compare(box4)) {
            System.out.println("boxes have the same weight");
        }
        else {
            System.out.println("boxes aren't equal");
        }




    }
}
