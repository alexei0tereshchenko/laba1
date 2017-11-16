package com;

public class Comparator {

    public boolean compare (Egg egg1, Egg egg2)
    {
        //Приведение к типу int дает возможность определить, какая из букв раньше в алфавите
        return ((int)egg1.getName().toCharArray()[0]>(int)egg2.getName().toCharArray()[0]);
    }
}

