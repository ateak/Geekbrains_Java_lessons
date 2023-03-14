package com.geekbrains.lesson2.homework;

public class Main {
    public static void main(String[] args) {
        Movable[] creatures = {
                new Cat("Барсик", 2000, 100),
                new Human("Настя", 9999, 60),
                new Cat("Мурзик", 20, 0),
                new Robot("Валли", 50000, 0),
                new Human("Рита", 5000, 5),
                new Robot("Грендайзер", 200000, 150000)
        };

        Obstacles[] obstacles = {
                new Wall(50),
                new RunningTrack(8999),
                new Wall(1),
                new RunningTrack(10),
        };
        boolean result = true;
        for (Movable creature : creatures) {
            for (Obstacles obstacle : obstacles) {
               switch (obstacle.type) {
                   case WALL -> result = creature.jump((Wall)obstacle);
                   case RUNNING_TRACK -> result = creature.run((RunningTrack)obstacle);
                };
               if (!result) {
                   break;
               }
            }
        }
    }
}
