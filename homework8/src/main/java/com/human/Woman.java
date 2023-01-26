package com.human;

import com.family.Family;

import java.util.Map;
import java.util.*;



public final class Woman extends Human {
    public Woman() {}
    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Woman(String name, String surname, int year, Family family) {
        super(name, surname, year, family);
    }

    public Woman(String name, String surname, int year, int iq, Family family, Map<String, String> schedule) {
        super(name, surname, year, iq, family, schedule);
    }

/*
    @Override
    public void greetPet() {
        if (petExist()) {
            System.out.printf("Приветик, %s\n", getFamily().getPets());
        } else {
            System.out.println("Нет животных");
        }
    }
*/

    public void makeup() {
        System.out.println("Нужен makeup! Срочно!");
    }

    @Override
    public String toString() {
        return String.format("Woman{name='%s', surname='%s', year=%d, iq=%d, schedule=%s}",
                this.getName(), this.getSurname(), this.getYear(), this.getIq(), this.getSchedule()
        );
    }

}
