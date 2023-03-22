package com.geekbrains.lesson4.generics;

public class GenBox<T> {
    private T obj;

    // так делать нельзя
    // static T staticField = ...

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public GenBox(T obj) {
        this.obj = obj;
    }

    // создавать объект обобщеного типа или создавпть массив этого типа в методе нельзя
//    public void doSomething() {
//        T object = new T();
//        T[] arr = new T[10];
//    }

        // так делать можно
//    public void doSomething(T[] arr) {
//
//    }


}
