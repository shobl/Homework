package com.familyDAO;


import com.abstract_classes.Pet;
        import com.family.Family;
        import com.human.Human;

        import java.util.ArrayList;

public class FamilyController {
    FamilyService familyService = new FamilyService();

    public void cleanDB() {
        familyService.cleanDB();
    }

    public void saveFamily(Family family) {
        familyService.saveFamily(family);
    }

    public ArrayList<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int number) {
        familyService.getFamiliesBiggerThan(number);
    }

    public void getFamiliesLessThan(int number) {
        familyService.getFamiliesLessThan(number);
    }

    public void countFamiliesWithMemberNumber(int number) {
        familyService.countFamiliesWithMemberNumber(number);
    }

    public void createNewFamily(Human mother, Human father) {
        familyService.createNewFamily(mother, father);
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyService.deleteFamilyByIndex(index);
    }

    public boolean deleteFamily(Family family) {
        return familyService.deleteFamily(family);
    }

    public Family bornChild(Family family, String maleName, String femaleName) {
        return familyService.bornChild(family, maleName, femaleName);
    }

    public Family adoptChild(Family family, Human child) {
        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyService.deleteAllChildrenOlderThan(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyByIndex(int index) {
        return familyService.getFamilyByIndex(index);
    }

    public ArrayList<Pet> getPets(int index) {
        return familyService.getPets(index);
    }

    public void addPet(int index, Pet pet) {
        familyService.addPet(index, pet);
    }
}

