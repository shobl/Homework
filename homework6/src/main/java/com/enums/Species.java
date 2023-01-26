package com.enums;

public enum Species {

    DOG("dog", false, true, 4),
    DOMESTIC_CAT("cat",false, true, 4),
    BIRD("bird", true, false, 2),
    SPIDER("spider", false, false, 8),


    PYTHON("piton", false, false, 0),
    FISH("риба", false, false, 0),
    ROBO_CAT("робоКіт", true, false, 4),
    UNKNOWN("невідомо", false, false, 0);

    ;

    private final String name;
    private final boolean canFly;
    private final boolean hasFur;
    private final int numberOfLegs;

    Species(String name, boolean canFly, boolean hasFur, int numberOfLegs) {
        this.name = name;
        this.canFly = canFly;
        this.hasFur = hasFur;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String toString() {
        return "Species{" +
                "name='" + name + '\'' +
                ", canFly=" + canFly +
                ", hasFur=" + hasFur +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}

