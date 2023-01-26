package com.family;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        if (this.mother != null) {
            this.mother.setFamily(this);
        }
        this.father = father;
        if (this.father != null) {
            this.father.setFamily(this);

        }
        this.children = new Human[1];

        this.pet = new Pet();

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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        children[children.length - 1] = child;
        children = Arrays.copyOf(children, children.length + 1);
        child.setFamily(this);
    }

    public boolean deleteChild(int index) {

        if (index >= children.length || index < 0) return false;

        Human[] updatedChildren = new Human[children.length - 1];

        for (int i = 0, j = 0; i < children.length; i++) {
            if (i == index) {
                children[i].setFamily(null);
                continue;
            }
            updatedChildren[j++] = children[i];
        }
        children = updatedChildren;
        return true;
    }

    public int countFamily() {
        return (mother == null ? 0 : 1) + (father == null ? 0 : 1) + children.length;
    }


    @Override
    public String toString() {
        return String.format("Family{mother=%s, father=%s, children=%s, pet=%s}",
                this.mother.getFullName(), this.father.getFullName(), Arrays.toString(this.children), this.pet
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

/*    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Before deleting: %s\n", this);
    }*/

}
