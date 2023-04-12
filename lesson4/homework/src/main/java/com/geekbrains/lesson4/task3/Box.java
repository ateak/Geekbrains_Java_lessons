package com.geekbrains.lesson4.task3;

import java.util.ArrayList;

public class Box <F extends Fruit> {


    private ArrayList<F> fruitBox = new ArrayList<>();
    private float boxWeight;

    public ArrayList<F> getFruitBox() {
        return fruitBox;
    }

    public float getWeight() {
        if (fruitBox.size() == 0) {
            return 0.0f;
        }
        for (F fruit : fruitBox) {
            boxWeight += fruit.weight;
            //System.out.println(fruit);
        }
        return boxWeight;
    }

    public boolean compare(Box<?> box) {
        return this.boxWeight == box.boxWeight;
    }

    public void addFruitToBox(F fruit) {
        fruitBox.add(fruit);
    }

    public void putFruitToAnotherBox(Box<F> box) {
        if (this == box) {
            return;
        }
        box.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }
}
