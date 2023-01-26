package org.example;

import com.abstract_classes.Pet;
import com.family.Family;
import com.pet.DomesticCat;
import com.pet.Dog;
import com.pet.RoboCat;
import com.pet.Fish;

import com.human.*;

import com.enums.DayOfWeek;
import com.enums.Species;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> schedule = new HashMap<>() {
            {
                put(DayOfWeek.MONDAY.getDay(), "Плавание");
                put(DayOfWeek.TUESDAY.getDay(), "Йога");
                put(DayOfWeek.WEDNESDAY.getDay(), "Серинзи-кемпо");
                put(DayOfWeek.THURSDAY.getDay(), "Курсы JAVA");
                put(DayOfWeek.FRIDAY.getDay(), "Бассейн+Сауна");
                put(DayOfWeek.SATURDAY.getDay(), "Курсы английского");
                put(DayOfWeek.SUNDAY.getDay(), "Отдых на природе");
            }
        };
        //family1
        Woman mother = new Woman("Вика", "Карпенко", 1974);
        Man father = new Man("Андрей", "Карпенко", 1965);
        Human child = new Human("Роман", "Карпенко", 2001);
        Set<String> petHabits = new HashSet<>(Arrays.asList("клянчить вкусняшки", "прятать носки", "проситься на ручки"));

        Dog pet = new Dog(Species.DOG, "Пулька", 3, 50, petHabits);

        System.out.println(child);

        System.out.println(pet);

        Family family = new Family(mother, father);
        System.out.println(family);
 //       family.addChild(child);


        System.out.println();
        System.out.println(mother.getFullName());

        pet.eat();
        pet.respond();
        pet.foul();

        father.setSchedule(schedule);
        System.out.println(father);

        System.out.println();


        //family2
        Woman mother2 = new Woman("Вика", "Карпенко", 1974, 90, family, schedule);
        Man father2 = new Man("Андрей", "Карпенко", 1965, 90, family, schedule);
        Human child2 = new Human("Роман", "Карпенко", 2001, 90, family, schedule);
        Human child3 = new Human("Наташа", "Карпенко", 1985, 90, family, schedule);
        Dog pet2 = new Dog(Species.DOG, "Пулька", 3, 50, petHabits);

        System.out.println();
        System.out.println();
        Family family2 = new Family(mother2, father2);
        //     family2.addChild(child2);
        //       family2.addChild(child3);

        family2.addPet(pet2);
        System.out.println(child2);
        //       System.out.println(pet2);
        System.out.println(family2);

        System.out.println(family2.countFamily());

        //       family2.deleteChild(1);
        //      System.out.println(family2.countFamily());

/*
        for (
                int i = 0;
                i < 11111111; i++) {
            Human human = new Human("Petro", "Petrenko", 2023);
        }
*/

    }
}
