package com.geekbrains.lesson2.homework;

public class Wall extends Obstacles {
    protected int height;

    public Wall(int height) {
        this.height = height;
        this.type = ObstacleType.WALL;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ObstacleType getType() {
        return type;
    }

    public void setType(ObstacleType type) {
        this.type = type;
    }
}
