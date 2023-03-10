package com.geekbrains.lesson1.homework;

import static com.geekbrains.lesson1.homework.Dog.countDogs;
import static com.geekbrains.lesson1.homework.DomesticCat.countCats;

public class Main {
    public static void main(String[] args) {
        Animal[] DogAndCat = {
                new Dog("Bobik"),
                new DomesticCat("Murka"),
                new Dog("Tuzik"),
                new DomesticCat("Krasotka"),
        };
        for (Animal animal : DogAndCat) {
            animal.run(100);
            animal.swim(5);
        }
        System.out.println("Number of cats: " + countCats);
        System.out.println("Number of dogs: " + countDogs);
    }
}
