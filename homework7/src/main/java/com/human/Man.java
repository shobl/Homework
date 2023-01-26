package com.human;

import com.family.Family;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public final class Man extends Human {

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Man(String name, String surname, int year, Family family) {
        super(name, surname, year, family);
    }

    public Man(String name, String surname, int year, int iq, Family family, Map<String, String> schedule) {
        super(name, surname, year, iq, family, schedule);
    }


/*
    @Override
    public void greetPet() {
        if (petExist()) {
            System.out.printf("Привет, %s\n", getFamily().getPets());
        } else {
            System.out.println("Нет животных");
        }
    }
*/

    public void repairCar() {
        System.out.println("Нужно починить автомобиль. Или пора покупать новый");
    }


    @Override
    public String toString() {
        return String.format("Man{name='%s', surname='%s', year=%d, iq=%d, schedule=%s}",
                this.getName(), this.getSurname(), this.getYear(), this.getIq(), this.getSchedule()
        );
    }

}

