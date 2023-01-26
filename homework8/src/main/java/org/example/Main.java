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
import com.familyDAO.FamilyController;

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
        pet.eat();
        pet.respond();
        pet.foul();
        System.out.println();

        father.setSchedule(schedule);
        System.out.println(father);
        System.out.println();

        FamilyController fc = new FamilyController();
        Family family = new Family(mother, father);
        fc.saveFamily(family);
        fc.displayAllFamilies();
  /*      fc.adoptChild(family, child);
        fc.addPet(0, pet);
        fc.displayAllFamilies();*/

        //      family.addChild(child);
/*
        family.addPet(pet);
        System.out.println(family);

        System.out.println();
        System.out.println(mother.getFullName());
*/



        //family2
        Woman mother2 = new Woman("Вика", "Карпенко", 1974, 90, family, schedule);
        Man father2 = new Man("Андрей", "Карпенко", 1965, 90, family, schedule);
        Human child2 = new Human("Роман", "Карпенко", 2001, 90, family, schedule);
        Human child3 = new Human("Наташа", "Карпенко", 1985, 90, family, schedule);
        Dog pet2 = new Dog(Species.DOG, "Пулька", 3, 50, petHabits);

        fc.createNewFamily(mother2, father2);
        Family family2 = fc.getFamilyByIndex(1);
        System.out.println();
        System.out.println();

        //     family2.addChild(child2);
        //       family2.addChild(child3);

        family2.addPet(pet2);
        System.out.println(child2);
        //       System.out.println(pet2);
        System.out.println(family2);

        System.out.println(family2.countFamily());

        fc.displayAllFamilies();
        fc.countFamiliesWithMemberNumber(4);
        fc.deleteAllChildrenOlderThan(14);

        fc.getFamiliesBiggerThan(5);
        fc.getFamiliesBiggerThan(2);
        fc.getFamiliesLessThan(10);

        fc.deleteFamilyByIndex(1);
        fc.displayAllFamilies();

        fc.deleteFamily(family);
        fc.displayAllFamilies();

        //       family2.deleteChild(1);
        //      System.out.println(family2.countFamily());

 /*       for (
                int i = 0;
                i < 11111111; i++) {
            Human human = new Human("Petro", "Petrenko", 2023);
        }*/

    }
}
