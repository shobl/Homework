package com.familyDAO;
import com.abstract_classes.Pet;
import com.family.Family;
import com.human.Human;

import java.util.ArrayList;

public class FamilyService {
    CollectionFamilyDao familyDao = CollectionFamilyDao.getInstance();

    public void cleanDB() {
        familyDao.cleanDB();
    }

    public void saveFamily(Family family) {
        familyDao.saveFamily(family);
    }

    public ArrayList<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyDao.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int number) {
        ArrayList<Family> families = familyDao.getFamiliesBiggerThan(number);
        if (families.size() > 0) {
            System.out.printf("Семьи, в которых проживает больше, чем %d людей:\n", number);
            for (Family family : families) {
                familyDao.printFamily(family);
            }
        } else {
            System.out.printf("Нет семей, в которых проживет больше чем %d людей.\n", number);
        }
    }

    public void getFamiliesLessThan(int number) {
        ArrayList<Family> families = familyDao.getFamiliesLessThan(number);
        if (families.size() > 0) {
            System.out.printf("Семьи, в которых количество людей меньше, чем %d людей:\n", number);
            for (Family family : families) {
                familyDao.printFamily(family);
            }
        } else {
            System.out.printf("Нет семей с количеством людей, меньшим чем %d.\n", number);
        }
    }

    public void countFamiliesWithMemberNumber(int number) {
        int familiesSize = familyDao.countFamiliesWithMemberNumber(number);
        System.out.printf("Количество семей, в которых %d членов семьи: %d\n", number, familiesSize);
    }

    public void createNewFamily(Human mother, Human father) {
        Family family = new Family(mother, father);
        familyDao.saveFamily(family);
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyDao.deleteFamily(index);
    }

    public boolean deleteFamily(Family family) {
        return familyDao.deleteFamily(family);
    }

    public Family bornChild(Family family, String maleName, String femaleName) {
        return familyDao.bornChild(family, maleName, femaleName);
    }

    public Family adoptChild(Family family, Human child) {
        family.addChild(child);
        familyDao.saveFamily(family);
        return family;
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyDao.deleteAllChildrenOlderThan(age);
    }

    public int count() {
        return familyDao.count();
    }

    public Family getFamilyByIndex(int index) {
        return familyDao.getFamilyByIndex(index);
    }

    public ArrayList<Pet> getPets(int index) {
        return familyDao.getPets(index);
    }

    public void addPet(int index, Pet pet) {
        familyDao.addPet(index, pet);
    }

}
