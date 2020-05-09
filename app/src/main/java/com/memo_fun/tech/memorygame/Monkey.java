package com.memo_fun.tech.memorygame;

import android.widget.ImageView;

public class Monkey extends Animal {
    public Monkey(String name, ImageView image, Status status, boolean isSameAnimal) {
        super(name, image, status, isSameAnimal);
    }

    public Monkey(String name, ImageView image, Status status) {
        super(name, image, status);
    }

    @Override
    public boolean isSameAnimal(Animal other) {
        return other instanceof Monkey;
    }
}
