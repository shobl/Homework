package com.family;

import com.abstract_classes.Pet;
import com.human.Human;

import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pets;

    public Family(Human mother, Human father) {
        this.mother = mother;
        if (this.mother != null) {
            this.mother.setFamily(this);
        }
        this.father = father;
        if (this.father != null) {
            this.father.setFamily(this);

        }
        this.children = new ArrayList<>();

        this.pets = new HashSet<>();

    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }


    public void addPet(Pet pet) {

        this.pets.add(pet);

    }

    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);
    }

    public boolean deleteChild(int index) {
        try {
            Human child = children.remove(index);
            child.setFamily(null);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }


    public boolean deleteChild(Human child) {
        for (Human childToFind : children) {
            if (Objects.equals(childToFind, child)) {
                childToFind.setFamily(null);
                break;
            }
        }
        return children.remove(child);
    }


    public int countFamily() {
        return (mother == null ? 0 : 1) + (father == null ? 0 : 1) + children.size();
    }

/*
    @Override
    public String toString() {
        return "Family{" +
                "mother=" + this.mother.getFullName() +
                ", father=" + this.father.getFullName() +
                ", children=" + this.children +
                ", pets=" + this.pets +
                '}';
    }
*/

/*    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.getFullName() +
                ", father=" + father.getFullName() +
                ", children=" + children +
                ", pets=" + pets +
                '}';
    }*/

    @Override
    public String toString() {
        return String.format("Family{mother=%s, father=%s, children=%s, pets=%s}",
                this.mother.getFullName(), this.father.getFullName(), this.children, this.pets
        );
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family family)) return false;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(children, family.children) && Objects.equals(pets, family.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children, pets);
    }



/*    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Before deleting: %s\n", this);
    }*/

}
