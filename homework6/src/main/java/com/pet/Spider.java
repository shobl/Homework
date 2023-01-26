package com.pet;

import com.abstract_classes.Pet;
import com.enums.Species;
import com.interfaces.Foul;

public class Spider extends Pet implements Foul {
    public Spider() {
    }
    public Spider(Species species, String nickname) {
        super(species, nickname);
    }

    public Spider(Species species, String nickname, int age, int trickLevel, String[] habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.printf("Я - %s. В пустыне я царь и Бог \n", this.getNickname());
    }
    @Override
    public void foul() {
        System.out.println("Сами сидите в этой банке! А я пошел гулять");
    }
}
