package com.pet;

import com.abstract_classes.Pet;
import com.enums.Species;

import java.util.Set;

public class Fish extends Pet {

    public Fish(Species species, String nickname) {
        super(species, nickname);
    }

    public Fish(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.printf("Я - %s и я регулярно говорю про вас все, что думаю \n", this.getNickname());
    }


}



