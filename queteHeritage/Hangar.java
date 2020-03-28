package com.company;

import java.util.ArrayList;

public class Hangar {

    public static void main(String[] args) {

        // la référence riri reçoit une nouvelle instance de la classe Duck
        Car mercedes = new Car("Mercedes", 0);
        Boat nabilus = new Boat("Nabilus", 0);

        System.out.println("La voiture de OUi Oui dit: " + mercedes.doStuff());
        System.out.println("Le bateau de OUi Oui dit: " + nabilus.doStuff());


        }
    }

