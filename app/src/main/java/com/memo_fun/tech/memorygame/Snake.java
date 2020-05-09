package com.memo_fun.tech.memorygame;

import android.widget.ImageView;

public class Snake extends Animal {
    public Snake(String name, ImageView image, Status status, boolean isSameAnimal) {
        super(name, image, status, isSameAnimal);
    }

    public Snake(String name, ImageView image, Status status) {
        super(name, image, status);
    }

    @Override
    public boolean isSameAnimal(Animal other) {
        return other instanceof Snake;
    }
}
