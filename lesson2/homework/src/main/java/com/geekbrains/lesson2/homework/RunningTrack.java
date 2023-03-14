package com.geekbrains.lesson2.homework;

public class RunningTrack extends Obstacles{
    protected int length;

    public RunningTrack(int length) {
        this.length = length;
        this.type = ObstacleType.RUNNING_TRACK;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public ObstacleType getType() {
        return type;
    }

    public void setType(ObstacleType type) {
        this.type = type;
    }
}

