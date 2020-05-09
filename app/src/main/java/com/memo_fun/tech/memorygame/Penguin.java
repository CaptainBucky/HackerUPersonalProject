package com.memo_fun.tech.memorygame;

import android.widget.ImageView;

public class Penguin extends Animal {
    public Penguin(String name, ImageView image, Status status, boolean isSameAnimal) {
        super(name, image, status, isSameAnimal);
    }

    public Penguin(String name, ImageView image, Status status) {
        super(name, image, status);
    }

    @Override
    public boolean isSameAnimal(Animal other) {
        return other instanceof Penguin;
    }

}


