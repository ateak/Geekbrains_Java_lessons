package com.geekbrains.lesson4.generics;

public class BoxWithNumbers<N extends Number> {
    private N[] array;

    public BoxWithNumbers(N... array) {
        this.array = array;
    }

    public double average() {
        double avg = 0.0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i].doubleValue();
        }
        return avg / array.length;
    }

    //<?> означает, что сюда можно подавать любой тип
    public boolean compareAverage(BoxWithNumbers<?> another) {
        return Math.abs(this.average() - another.average()) < 0.0001;
    }
}
