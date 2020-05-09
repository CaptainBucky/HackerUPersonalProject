package com.memo_fun.tech.memorygame;

import android.widget.ImageView;

public abstract class Animal extends Card {
    boolean isSameAnimal;
    public Animal(String name, ImageView image, Status status) {
        super(name, image, status);
    }


    public Animal(String name, ImageView image, Status status, boolean isSameAnimal) {
        super(name, image, status);
        this.isSameAnimal = isSameAnimal;
    }

    public boolean isSameAnimal(Animal other) {
        return isSameAnimal;
    }

    public void setSameAnimal(boolean sameAnimal) {
        isSameAnimal = sameAnimal;
    }
}
