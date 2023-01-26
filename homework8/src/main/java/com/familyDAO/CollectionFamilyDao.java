package com.familyDAO;


import com.abstract_classes.Pet;
import com.family.Family;
import com.human.Human;

import java.util.ArrayList;
import java.util.Random;

public class CollectionFamilyDao implements FamilyDao<Family> {
    private static CollectionFamilyDao collectionFamilyDao;
    private final ArrayList<Family> families = new ArrayList<>();
    private final int CURRENT_YEAR = 2022;

    public static CollectionFamilyDao getInstance() {
        if (collectionFamilyDao == null) {
            collectionFamilyDao = new CollectionFamilyDao();
        }
        return collectionFamilyDao;
    }


    public boolean updateFamilyInDB(Family newFamily) {
        boolean updated = false;
        for (Family family : families) {
            if (family.getMother().equals(newFamily.getMother())
                    && family.getFather().equals(newFamily.getFather())) {
                families.set(families.indexOf(family), newFamily);
                updated = true;
            }
        }
        return updated;
    }

    public void cleanDB() {
        families.clear();
    }

    public void printFamily(Family family) {
        System.out.printf("\t%d: %s\n", families.indexOf(family) + 1, family);
    }

    @Override
    public ArrayList<Family> getAllFamilies() {
        return families;
    }

    public void displayAllFamilies() {
        if (families.size() > 0) {
            System.out.println("Список семей: ");
            for (Family family : families) {
                printFamily(family);
            }
        } else {
            System.out.println("Список семей пустой");
        }
    }

    public ArrayList<Family> getFamiliesBiggerThan(int number) {
        ArrayList<Family> filteredFamilies = new ArrayList<>();
        for (Family family : families) {
            if (family.countFamily() > number) {
                filteredFamilies.add(family);
            }
        }
        return filteredFamilies;
    }

    public ArrayList<Family> getFamiliesLessThan(int number) {
        ArrayList<Family> filteredFamilies = new ArrayList<>();
        for (Family family : families) {
            if (family.countFamily() < number) {
                filteredFamilies.add(family);
            }
        }
        return filteredFamilies;
    }

    public int countFamiliesWithMemberNumber(int number) {
        int familiesSize = 0;
        for (Family family : families) {
            if (family.countFamily() == number) {
                familiesSize++;
            }
        }
        return familiesSize;
    }

    public Family bornChild(Family family, String maleName, String femaleName) {
        Random random = new Random();
        String name = random.nextInt(2) == 0 ? maleName : femaleName;
        String surname = family.getFather().getSurname();
        int iq = (family.getFather().getIq() + family.getMother().getIq()) / 2;
        Human child = new Human(name, surname, CURRENT_YEAR, iq);
        family.addChild(child);
        updateFamilyInDB(family);
        return family;
    }

    public void deleteAllChildrenOlderThan(int age) {
        for (Family family : families) {
            family.getChildren().removeIf(child -> CURRENT_YEAR - child.getYear() > age);
            updateFamilyInDB(family);
        }
    }

    public int count() {
        return families.size();
    }

    public ArrayList<Pet> getPets(int index) {
        return new ArrayList<>(getFamilyByIndex(index).getPets());
    }

    public void addPet(int index, Pet pet) {
        families.get(index).addPet(pet);
    }

    @Override
    public Family getFamilyByIndex(int index) {
        try {
            return families.get(index);
        } catch (Exception exception) {
            return null;
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        try {
            families.remove(index);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }

    @Override
    public void saveFamily(Family newFamily) {
        if (!updateFamilyInDB(newFamily)) {
            families.add(newFamily);
        }
    }
}

