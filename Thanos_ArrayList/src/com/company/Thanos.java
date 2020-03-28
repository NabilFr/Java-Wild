package com.company;

import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list

        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list

        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
        Hero blackWindow = new Hero ("Black Widow", 34);
        heroes.add(blackWindow);
        Hero captainAmerica = new Hero ("Captain America", 100);
        heroes.add(captainAmerica);
        Hero vision = new Hero ("Vision", 3);
        heroes.add(vision);
        Hero ironMan = new Hero ("Iron Man", 48);
        heroes.add(ironMan);
        Hero scarletWitch = new Hero ("Scarlet Witch", 29);
        heroes.add(scarletWitch);
        Hero thor = new Hero ("Thor", 1500);
        heroes.add(thor);
        Hero spiderMan = new Hero ("Spider-Man", 18);
        heroes.add(spiderMan);
        Hero hulk = new Hero ("Hulk", 49);
        heroes.add(hulk);
        Hero doctorStrange = new Hero ("Doctor Strange", 42);
        heroes.add(doctorStrange);

        // TODO 3 : It's Thor birthday, now he's 1501

        thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list

        int size = heroes.size()/2;

        List<Hero> heroes2 = heroes.subList(0, heroes.size()/2);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        
        for (Hero b : heroes2) {
            System.out.println(b.getName());
        }
    }
}
