package com.memo_fun.tech.memorygame;

import android.widget.ImageView;

public class Lizard extends Animal {
    public Lizard(String name, ImageView image, Status status, boolean isSameAnimal) {
        super(name, image, status, isSameAnimal);
    }

    public Lizard(String name, ImageView image, Status status) {
        super(name, image, status);
    }

    @Override
    public boolean isSameAnimal(Animal other) {
        return other instanceof Lizard;
    }

}
