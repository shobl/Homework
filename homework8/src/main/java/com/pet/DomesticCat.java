package com.pet;

import com.abstract_classes.Pet;
import com.enums.Species;
import com.interfaces.Foul;

import java.util.Set;

    public class DomesticCat extends Pet implements Foul {

        public DomesticCat(Species species, String nickname) {
            super(species, nickname);
        }

        public DomesticCat(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
            super(species, nickname, age, trickLevel, habits);
        }


        @Override
        public void respond() {
            System.out.printf("Я, %s, хоть и домашний, но гуляю сам-по-себе \n", this.getNickname());
        }

        @Override
        public void foul() {
            System.out.println("Я не трогал вазон и шторы!!!");
        }
    }



