package com;

import java.util.ArrayList;

public class Egg implements Nutritious {
    private String numberOfEggs;
    private static double calories = 100;
    private String name;


    public static double getCalories() {
        return calories;
    }

    //Автоматически переопределиил equals для данного класса
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Egg egg = (Egg) o;

        return numberOfEggs.equals(egg.numberOfEggs);
    }

    //hashCode тоже переопределен автоматически
    @Override
    public int hashCode() {
        return numberOfEggs.hashCode();
    }


    /*Подсчет яиц в завтраке. Вообще говоря, он считает не сами яйца, а колличество объектов класса Egg,
    которые могут содержать одно, два или три яйца*/
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

  /*конструктор без параметров. При таком объявлении будет создаваться объект с параметром "один", т.е. одно яйцо
    в объекте класса Egg*/
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

    //Считает колличество калорий в объекте в зависимости от кол-ва яиц в нем
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
