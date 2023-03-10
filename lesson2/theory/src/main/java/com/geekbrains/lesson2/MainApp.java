package com.geekbrains.lesson2;

public class MainApp {
    static class Human {
        private Transport currentTransport;

        public void stop() {
            if (currentTransport != null) {
                currentTransport.stop();
                currentTransport = null;
            } else {
                System.out.println("А я никуда и не еду");
            }
        }

        public void drive(Transport transport) {
            transport.start();
            this.currentTransport = transport;
        }
    }

    static class Car implements Transport{
        @Override
        public void start() {
            System.out.println("Человек начал ехать на машине");
        }
        @Override
        public void stop() {
            System.out.println("Человек остановил свою машину");
        }
    }
    static class Skateboard implements Transport{
        @Override
        public void start() {
            System.out.println("Человек начал ехать на скейтборде");
        }
        @Override
        public void stop() {
            System.out.println("Человек остановил свой скейтборд");
        }
    }
    static class Bicycle implements Transport {
        @Override
        public void start() {
            System.out.println("Человек начал ехать на велосипеде");
        }
        @Override
        public void stop() {
            System.out.println("Человек остановил свой велосипед");
        }
    }

    static class Moto implements Transport {
        @Override
        public void start() {
            System.out.println("Человек начал ехать на мотоцикле");
        }
        @Override
        public void stop() {
            System.out.println("Человек остановил свой мотоцикл");
        }
    }

    public static void main(String[] args) {
        Moto moto = new Moto();
        Car car = new Car();
        Human human = new Human();
        human.stop();
        human.drive(moto);
        human.stop();
        human.drive(car);
        human.stop();
        human.stop();
    }
}
