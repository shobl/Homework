package org.example;

import com.family.Family;
import com.family.Pet;
import com.family.Human;

import com.enums.DayOfWeek;
import com.enums.Species;

public class Main {
    public static void main(String[] args) {

        String[][] schedule = {
                {DayOfWeek.MONDAY.getDay(), "Плавание"},
                {DayOfWeek.TUESDAY.getDay(), "Йога"},
                {DayOfWeek.WEDNESDAY.getDay(), "Серинзи-кемпо"},
                {DayOfWeek.THURSDAY.getDay(), "Курсы JAVA"},
                {DayOfWeek.FRIDAY.getDay(), "Бассейн+Сауна"},
                {DayOfWeek.SATURDAY.getDay(), "Курсы английского"},
                {DayOfWeek.SUNDAY.getDay(), "Отдых на природе"}
        };

        //family1
        Human mother = new Human("Вика", "Карпенко", 1974);
        Human father = new Human("Андрей", "Карпенко", 1965);
        Human child = new Human("Роман", "Карпенко", 2001);
        String[] petHabits = {"клянчить вкусняшки", "прятать носки", "проситься на ручки"};
        Pet pet = new Pet(Species.DOG, "Пулька", 3, 50, petHabits);

        System.out.println(child);

        System.out.println(pet);

        Family family = new Family(mother, father);
        family.addChild(child);
        family.setPet(pet);
        System.out.println(family);

        System.out.println();
        mother.getFullName();

        pet.eat();
        pet.respond();

        father.setSchedule(schedule);
        System.out.println(father);
        mother.greetPet();
        System.out.println();


        //family2
        Human mother2 = new Human("Вика", "Карпенко", 1974, 90, schedule, family);
        Human father2 = new Human("Андрей", "Карпенко", 1965, 90, schedule, family);
        Human child2 = new Human("Роман", "Карпенко", 2001, 90, schedule, family);
        Human child3 = new Human("Наташа", "Карпенко", 1985, 90, schedule, family);
        Pet pet2 = new Pet(Species.DOG, "Пулька", 3, 50, petHabits);


        Family family2 = new Family(mother2, father2);
        family2.addChild(child2);
        family2.addChild(child3);

        family2.setPet(pet2);
        System.out.println(child2);
        System.out.println(pet2);
        System.out.println(family2);

        System.out.println(family2.countFamily());
        family2.deleteChild(1);
        System.out.println(family2.countFamily());

        for (int i = 0; i < 11111111; i++) {
            Human human = new Human("Petro", "Petrenko", 2023);
        }

    }
}
