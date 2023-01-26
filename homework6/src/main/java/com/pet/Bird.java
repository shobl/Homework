package com.pet;

import com.abstract_classes.Pet;
import com.enums.Species;
import com.interfaces.Foul;

public class Bird extends Pet  implements Foul {
    public Bird() {
    }
    public Bird(Species species, String nickname) {
        super(species, nickname);
    }

    public Bird(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.printf("Мне есть что сказать. Я - %s и ругаюсь как он \n", this.getNickname());
    }
    @Override
    public void foul() {
        System.out.println("Что я такого сказал?!");
    }
}
