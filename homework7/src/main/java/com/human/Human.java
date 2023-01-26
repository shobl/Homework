package com.human;

import com.family.Family;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;

    private Family family;
    private Map<String, String> schedule;

    public Human(String name, String surname, int year, int iq) {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Family family) {

        this.name = name;
        this.surname = surname;
        this.year = year;
        this.family = family;
    }

    public Human(String name, String surname, int year, int iq, Family family, Map<String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = new HashMap<>();
        this.family = family;
    }
/*
    public Human(String name, String surname, int year, int iq, Map<String, String> schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
        this.family = family;
    }
*/


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public String getFullName() {
        return String.format("%s %s", name, surname);
    }

/*
    boolean petExist() {
        if (family != null && family.getPets() != null) {
            return true;
        }
        return false;
    }

    public void greetPet() {
        if (petExist()) {
            System.out.printf("Привет, %s\n", family.getPets());
        } else {
            System.out.println("Нет животных");
        }
    }
*/

/*
    public void describePet() {
        if (!petExist()) {
            System.out.println("Нет животных");
            return;
        }
        Pet pet = (Pet) family.getPets();
        String trickiness = pet.getTrickLevel() > 50 ? "очень хитрый" : "почти не хитрый";
        System.out.printf("У меня есть %s, ему %d лет, он %s\n",
                pet.getSpecie(), pet.getAge(), trickiness);
    }
*/

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", family=" + family +
                ", schedule=" + schedule +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(family, human.family) && Objects.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, family, schedule);
    }

  /*    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Before deleting: %s\n", this);
    }*/
}
