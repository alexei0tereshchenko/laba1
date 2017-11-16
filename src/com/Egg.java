package com;

import java.util.ArrayList;

public class Egg implements Nutritious {
    private String numberOfEggs;
    private static double calories = 100;
    private String name;


    public static double getCalories() {
        return calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Egg egg = (Egg) o;

        return numberOfEggs.equals(egg.numberOfEggs);
    }

    @Override
    public int hashCode() {
        return numberOfEggs.hashCode();
    }

    public int countEggs(ArrayList<Object> breakfast)
    {
        int eggCounter=0;
        for (Object i: breakfast)
        {
            if (i instanceof Egg)
                eggCounter++;
        }
        return eggCounter;
    }

    public Egg()
    {
        this.numberOfEggs = "один";
    }

    public Egg(String numberOfEggs, String name)
    {
        if (numberOfEggs.equals("один")||numberOfEggs.equals("два")||numberOfEggs.equals("три"))
            this.numberOfEggs=numberOfEggs;
        this.name=name;
    }

    public String getNumberOfEggs() {
        return numberOfEggs;
    }

    public void setNumberOfEggs(String numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }

    public double calculateCalories() {
        if (this.numberOfEggs == "один")
            return this.getCalories();
        else if (this.numberOfEggs == "два")
            return this.getCalories() * 2;
        else if (this.numberOfEggs == "три")
            return this.getCalories() * 3;
        else return 0;    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
