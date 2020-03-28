import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

class Cartes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        do{
            
        String[] paquet = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King" };
        System.out.println("Nouvelle Partie : Bienvenue au BlackJack");
        int scoreJoueur = 0;
        int scoreDealer = 0;
        
        scoreJoueur = player(scoreJoueur);
        scoreJoueur = player(scoreJoueur);

        scoreDealer = dealer(scoreDealer);

        int i = 0;
        while (i == 0) {
            System.out.println("Player,your score is "+ scoreJoueur +" do you pick another card? (1 for Yes or 2 for No) : ");
            int another = scanner.nextInt();

            if (another == 1) {
                scoreJoueur = player(scoreJoueur);
                if (scoreJoueur > 21){
                    System.out.println("Vous avez dépassé 21 !");
                    break;
                    
                }
            } else if (another == 2) {

                scoreDealer = dealerTurn(scoreDealer);
                i = 1;
            }
        }

        if (scoreJoueur > 21 || scoreJoueur <= scoreDealer || scoreDealer <=21) {
            System.out.println("Le Joueur a perdu");
        }
        else {
            System.out.println("Le Joueur a gagné");
        }
            System.out.println("Player, do you play another game? (1 for Yes or 2 for No) : ");
            x = scanner.nextInt();
    } while (x == 1);
    }

    public static int player(int score) {
        String[] paquet = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King" };
        System.out.println("Vous piochez une carte");
        int picked = new Random().nextInt(paquet.length);
        System.out.println("C'est un " + paquet[picked]);
        String carte = paquet[picked];
        int value = valueCarte(carte);
        score += value;
        System.out.println("Your score is : " + score);
        return score;

    }

    public static int dealer(int scoreDealer) {
        String[] paquet = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King" };
        System.out.println("Le dealer prend une carte");
        int picked = new Random().nextInt(paquet.length);
        System.out.println("C'est un " + paquet[picked]);
        String carte = paquet[picked];
        if (carte == "Ace") {
            aceDealer(scoreDealer);
        }
        scoreDealer += valueCarteDealer(carte);
        System.out.println("Dealer score is : " + scoreDealer);
        return scoreDealer;

    }


    public static int valueCarte(String carte) {
        int valueCarte = 0;

        if (carte == "Ten" || carte == "Jack" || carte == "Queen" || carte == "King") {
            return 10;
        } else {
            String deck[] = { "X", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

            for (int i = 0; i < deck.length; i++) {
                if (deck[i] == carte) {
                    valueCarte = i;
                }
            }
        }

        if (valueCarte == 1) {

            int i = 0;
            while (i == 0) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Whath value do you want for the Ace, choose 1 or 11: ");
                int choiceAce = scanner.nextInt();

                if (choiceAce == 1) {
                    valueCarte = 1;
                    i = 1;
                } else if (choiceAce == 11) {
                    valueCarte = 11;
                    i = 1;
                }

            }
        }
        return valueCarte;

    }

    public static int valueCarteDealer(String carte) {
        int valueCarte = 0;

        if (carte == "Ten" || carte == "Jack" || carte == "Queen" || carte == "King") {
            return 10;
        } else {
            String deck[] = { "X", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

            for (int i = 0; i < deck.length; i++) {
                if (deck[i] == carte) {
                    valueCarte = i;
                }
            }
        }

        return valueCarte;
    }

    public static int dealerTurn(int scoreDealer) {
        String[] paquet = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King" };
        while (scoreDealer < 17) {
            if (scoreDealer < 17) {
                scoreDealer = dealer(scoreDealer);

            } else {
                System.out.println("Le dealer s'arrête ici !");
            }
        }
        return scoreDealer;

    }

    public static int aceDealer(int score) {

        if (score + 11 >= 17 && score + 11 <= 21) {
            score += 11;
        } else {
            score += 1;
        }
        return score;
    }
}
