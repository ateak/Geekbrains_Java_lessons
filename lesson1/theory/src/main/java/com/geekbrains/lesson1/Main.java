package com.geekbrains.lesson1;

public class Main {
    public static void main(String[] args) {
        Animal[] DogAndCat = {
                new Dog("Bobik"),
                new DomesticCat("Murka"),
        };
        for (Animal animal : DogAndCat) {
            animal.run(150);
            animal.swim(5);
        }
    }

}
