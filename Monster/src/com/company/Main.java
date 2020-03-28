package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Monster JonLeBelliqueux = new Monster("JonLeBelliqueux", 1, 34);
        Monster JulienLeSorcier = new Monster("JulienLeSorcier", 2, 19);

        while (JonLeBelliqueux.getLife() > 0 &&  JulienLeSorcier.getLife() > 0) {
            Random rand = new Random();
            int n = rand.nextInt(50);

            if (n % 2 == 0) {
                System.out.println(JonLeBelliqueux.takeHit(JulienLeSorcier.getDamage()));
            }
            else {
                System.out.println(JulienLeSorcier.takeHit(JonLeBelliqueux.getDamage()));
            }
        }

        System.out.println("Jon a " + JonLeBelliqueux.getLife() + " points de vie");
        System.out.println("Julien a " + JulienLeSorcier.getLife() + " points de vie");








        /* System.out.println("Your life: " + JonLeBelliqueux.getLife());
        while (JonLeBelliqueux.getLife() - JulienLeSorcier.getDamage() >= 0){
            System.out.println(JonLeBelliqueux.takeHit(JulienLeSorcier.getDamage()));
            if (JonLeBelliqueux.getLife() < 1) {
                System.out.println(JonLeBelliqueux.getName() + " is K.O");
            }
        }
        System.out.println(JulienLeSorcier.getLife());
        while (JulienLeSorcier.getLife() >= 1){
            JulienLeSorcier.takeHit(JonLeBelliqueux.getDamage());
            System.out.println(JulienLeSorcier.getLife());
        }*/

    }
}
