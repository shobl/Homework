package com.pet;

import com.abstract_classes.Pet;

import com.enums.Species;
import com.interfaces.Foul;

public class Dog extends Pet implements Foul {
    public Dog() {
    }

    public Dog(Species species, String nickname) {
        super(species, nickname);
    }

    public Dog(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.printf("Привет, хозяин. Я - %s. Я соскучился!\n", this.getNickname());
    }

    @Override
    public void foul() {
        System.out.println("Гав!");
    }
}

