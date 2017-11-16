package com;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Egg egg1 = new Egg("три", "Птицефабрика Рассвет");
        Egg egg2 = new Egg("два", "Барановичская птицефабрика");
        ArrayList<Egg> breakfast = new ArrayList<Egg>();
        breakfast.add(egg1);
        breakfast.add(egg2);
        if(args[0].equals("-calories"))
        {
            double calories=0;
            for (Egg i: breakfast
                    ) {
                calories+=i.calculateCalories();
            }
            System.out.println("There are "+calories+" calories in the breakfast");
        }

        //Сортировка в алфавитном порядке первой буквы названия (поле name в классе Egg)
        if(args[0].equals("-sort"))
        {
            Comparator comparator = new Comparator();
            for (int i=0; i<breakfast.size()-1; i++) {
                if(comparator.compare(breakfast.get(i), breakfast.get(i+1)))
                    breakfast.set(i,breakfast.get(i+1));
            }
        }
    }
}
