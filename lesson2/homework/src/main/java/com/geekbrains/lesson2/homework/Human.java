package com.geekbrains.lesson2.homework;

public class Human implements Movable {
    protected String name;
    protected int maxRunDistance;
    protected int maxJumpDistance;

    public Human(String name, int maxRunDistance, int maxJumpDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public boolean run(RunningTrack track) {
        if (track.length > 0 && track.length <= maxRunDistance) {
            System.out.println(name + " пробежал дистанцию в " + track.length + " метров");
            return (true);
        }
        else {
            System.out.println(name + " не смог пробежать дистанцию в " + track.length + " метров");
            return (false);
        }
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.height > 0 && wall.height <= maxJumpDistance) {
            System.out.println(name + " перемахнул через стену высотой " + wall.height + " метров");
            return (true);
        }
        else {
            System.out.println(name + " не смог преодолеть стену высотой " + wall.height + " метров");
            return (false);
        }
    }
}
