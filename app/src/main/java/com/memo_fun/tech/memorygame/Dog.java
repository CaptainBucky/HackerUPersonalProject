package com.memo_fun.tech.memorygame;

import android.widget.ImageView;

public class Dog extends Animal {
    public Dog(String name, ImageView image, Status status, boolean isSameAnimal) {
        super(name, image, status, isSameAnimal);
    }

    public Dog(String name, ImageView image, Status status) {
        super(name, image, status);
    }

    @Override
    public boolean isSameAnimal(Animal other) {
        return other instanceof Dog;
    }


}
