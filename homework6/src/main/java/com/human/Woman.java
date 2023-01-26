package com.human;

import com.abstract_classes.Pet;
import com.family.Family;

import java.util.Arrays;


public final class Woman extends Human {
    public Woman() {}

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, Family family) {
        super(name, surname, year, family);
    }

    public Woman(String name, String surname, int year, int iq, String[][] schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    @Override
    public void greetPet() {
        if (petExist()) {
            System.out.printf("Приветик, %s\n", getFamily().getPet().getNickname());
        } else {
            System.out.println("Нет животных");
        }
    }

    public void makeup() {
        System.out.println("Нужен makeup! Срочно!");
    }

    @Override
    public String toString() {
        return String.format("Woman{name='%s', surname='%s', year=%d, iq=%d, schedule=%s}",
                this.getName(), this.getSurname(), this.getYear(), this.getIq(),
                Arrays.deepToString(this.getSchedule())
        );
    }
}
