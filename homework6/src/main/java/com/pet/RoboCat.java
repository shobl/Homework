package com.pet;

import com.abstract_classes.Pet;
import com.enums.Species;
import com.interfaces.Foul;

public class RoboCat extends Pet implements Foul{

    public RoboCat() {
    }

    public RoboCat(Species species, String nickname) {
        super(species, nickname);
    }

    public RoboCat(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.printf("Я роботозированный кот %s\n", this.getNickname());
    }

    @Override
    public void foul() {

        System.out.println("Я не туплю - не мешает меня подзарядить.");

    }

}
