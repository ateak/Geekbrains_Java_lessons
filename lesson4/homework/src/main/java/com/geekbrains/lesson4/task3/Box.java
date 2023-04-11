package com.geekbrains.lesson4.task3;

import java.util.ArrayList;

public class Box <F extends Fruit> {
    private ArrayList<F> fruitBox = new ArrayList<>();
    //private int fruitAmount;
    private float boxWeight;

    public ArrayList<F> getFruit() {
        return fruitBox;
    }
    public void setFruit(ArrayList<F> fruitBox) {
        this.fruitBox = fruitBox;
    }

    public float getWeight() {
        for(F fruit : fruitBox) {
            boxWeight = fruit.weight++;
            //System.out.println(fruit);
        }
        return boxWeight;
    }

    public boolean compare(Box<F> box) {
        if (this.boxWeight == box.boxWeight)
            return true;
        return false;
    }

    public void addFruitToBox(F fruit) {
        fruitBox.add(fruit);
    }

    public void putFruitToAnotherBox(Box<F> box) {
        box.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }
}
