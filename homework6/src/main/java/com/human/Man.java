package com.human;

import com.family.Family;

import com.abstract_classes.Pet;
import java.util.Arrays;

public final class Man extends Human{
    public Man() {}

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, Family family) {
        super(name, surname, year, family);
    }

    public Man(String name, String surname, int year, int iq, String[][] schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    @Override
    public void greetPet() {
        if (petExist()) {
            System.out.printf("Привет, %s\n", getFamily().getPet().getNickname());
        } else {
            System.out.println("Нет животных");
        }
    }

    public void repairCar() {
        System.out.println("Нужно починить автомобиль. Или пора покупать новый");
    }

    @Override
    public String toString() {
        return String.format("Man{name='%s', surname='%s', year=%d, iq=%d, schedule=%s}",
                this.getName(), this.getSurname(), this.getYear(), this.getIq(),
                Arrays.deepToString(this.getSchedule())
        );
    }
}

