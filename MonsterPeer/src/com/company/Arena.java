package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Arena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        FireMonster salameche = new FireMonster("Salameche",4,25);
        GrassMonster bulbizare = new GrassMonster("Bulbizar",4,25);
        WaterMonster carapuce = new WaterMonster("Carapuce",3,25);
        FireMonster galopa = new FireMonster("Galopa",5,25);
        WaterMonster flagadoss = new WaterMonster("Flagadoss",6,25);
        GrassMonster coconfort = new GrassMonster("Coconfort",4,25);


        Monster [] pokemon = {salameche, carapuce, bulbizare};
        Monster [] wild = {coconfort, flagadoss, galopa};




        do {

            int randPokemon = rand.nextInt(3);


            System.out.println("A wild Pokemon appears : " + wild[randPokemon].getName() + " !");

        if (randPokemon == 2) {
            System.out.println("                     :`./\n" +
                    "                    _|  ,-\n" +
                    "               ,'\"\"'    ,`\n" +
                    "             ,'.\\       `.    __  ,.-.\n" +
                    "          . ./ `'    __  '. ,'  \\ `.|\n" +
                    "          \\\\  \\   .\"'  L   \"     `\" `\\                          _,-.\n" +
                    "           \\` |\\.`      7     .,   :._|   --'`.                 ` |\n" +
                    "          ` \\`+ `'\\      \\^--\"  `. |    ,'     `.            ,..' |\n" +
                    "           | ,.    |              ` `.  |    ..  '.          |    /\n" +
                    "           ':P'     '.    ,..      \\  `-+`\"-'  `._ \\     -`,- ..,'\n" +
                    "          /        / `-,-'  ,'`.    `.   ; .--'   `+    '.   | ,\n" +
                    "         /     _..     .   `-.  \\,.   `-'  '.  `.^  `\".__|   ' |\n" +
                    "        '   , / |       `.   \\    |        ,'     \\           /\n" +
                    "         `\"' \" .         \\   |  __ \\    ,-'       `----.   _,'\n" +
                    "              /           |  `\"' _} `\"\"'                `-'\n" +
                    "             /.'         /     .-.         ,\".\n" +
                    "     .._,.  /           /     '-.,'    ,'-. .'.\n" +
                    "    /  `. \\/             `-.      `.   /`.  :\n" +
                    "   /  __ `.'                '-.     `-+_.'  .'          ,__\n" +
                    "  / .'  `.___                  `,..__      <__          \\ (\n" +
                    " / /       \"..   /                   `-.     .' .-'\"`--.'  \\\n" +
                    "/  |       /-'  /                       \\ ,._|  |          /'\n" +
                    "\\.'|+.+.  (`..,'                         \\`._ _,'           \\__\n" +
                    " \\ |||| \\ _`.^ `.            .            |  \"    .'`\"-.       `.\n" +
                    "  `+'|/ `( \\'    `-....__    |            |._,\".,'     `,        |\n" +
                    "                         `:-.|            `           ..'   ,'`.,-\n" +
                    "                          |  |            |`.        '-..    . /\n" +
                    "                          '  |           /  /           `.   |\n" +
                    "                           ` '          /  ',.         ,     `._\n" +
                    "                            \\|        ,'   \\'|         :  __    '\n" +
                    "                             `,     ,`     .._`..       `'  `-,.`.\n" +
                    "                       _`'`\".  `.   ``-._ /   F   )        ,._\\ `\n" +
                    "                      '-\"'`, \\   \\ ,. ).-'-.^,|_,'         `  '.\n" +
                    "                          '.. \\___j  `\"'               ,..  | .'\n" +
                    "                             \\            ___       ,. `\\ \\,+-'\n" +
                    "                              7.._   .--+`.  |_    |  `,'\n" +
                    "                           _,'  .'`--'  '    7 ` v.-\n" +
                    "                         .\"._  /-.  -.   \\.^-`\n" +
                    "                       .'  __+'...`'  `--'\n" +
                    "                        `\"\" ");
        }
        else if (randPokemon == 1) {
            System.out.println("                   ,-'\"-.\n" +
                    "             __...| .\".  |\n" +
                    "        ,--+\"     ' |   ,'\n" +
                    "       | .'   ..--,  `-' `.\n" +
                    "       |/    |  ,' |       :\n" +
                    "       |\\...-+-\".._|       |\n" +
                    "     ,\"            `--.     `.     _..-'+\"/__\n" +
                    "    /   .              |      :,-\"'     `\" |_'\n" +
                    " ..| .    _,....___,'  |    ,'            /\\\n" +
                    ".\\'.__.-'  /V     |   '                ,'\"\"\n" +
                    "`. |  `:  \\.       |  .               ,'         ,.-.\n" +
                    "  `:       |       |  '             .^.        ,' ,\"`.\n" +
                    "    `.     |       | /               _.\\.---..'  /   |     ,-,.\n" +
                    "      `._  A      / j              .\"       /   /    |   .',' |\n" +
                    "         `. `...-' ,'             /        /._ /     | ,' /   |\n" +
                    "           |\"-----'             ,'        /   /-.__  |'  /    |\n" +
                    "           | _.--'\"'\"\"`.       .         /   /     `\"^-.,     |\n" +
                    "           |\"       ____\\     j             j            `\"--.|\n" +
                    "           |  _.-\"\"'     \\    |             |                j\n" +
                    "         _,+.\"_           \\   |             |                |\n" +
                    "        '    . `.     _.-\"'.     ,          |                '\n" +
                    "       |_    | `.`. ,'      `.   |          |               .\n" +
                    "       | `-. |  ,'.\\         .\\   \\         |              /\n" +
                    "       |\\   ;+-'   \"\\      ,'  `.  \\        |             /\n" +
                    "       '\\\\.\"         \\ _.-'     ,`. \\       '            /\n" +
                    "        \\\\\\           :       .'   `.`._     \\          / `-..-.\n" +
                    "         ``.          |    _.\" _...,:.._`.    `._     ,'   -. \\'\n" +
                    "          `.`.        |`\".'__.'           `,...__\"--`/  |   / |\n" +
                    "            `.`.     _'    \\|             ,'       ,'_  `..'  |..__,.\n" +
                    "              `._`--\".'     \\`._      _,-'       ,' `-'  /    | .  ,'\n" +
                    "                 `\"\"'        `. `\"'\"\"'   ,-\" _,-'    _ .'     '  `' `.\n" +
                    "                               `-.._____:  |\"       _,\" .\"  ,'__,..\"'\n" +
                    "                                         `.|-...,.<'    `,_\"\"'`./\n" +
                    "                                             `.'   `\"--'\" \n");
        }
        else {
            System.out.println("                 _.---._\n" +
                    "               .'       '.\n" +
                    "              /           \\\n" +
                    "             / /'-.   .-'\\ \\\n" +
                    "             '.`\"\"\"` `\"\"\"`.'\n" +
                    "              /'-._   _.-'\\\n" +
                    "             /_.--\\`-`/--._\\\n" +
                    "             ;    |'-'|    ;\n" +
                    "             |  .'/ | \\'.  |\n" +
                    "             |  | \\ | / |  |\n" +
                    "              \\  \\/\\|/\\/  /\n" +
                    "               \\_/  _  \\_/\n" +
                    "                |-'` `'-|\n" +
                    "                |.-\"\"\"-.|\n" +
                    "                \\ .---. /\n" +
                    "                 '._ _.'\n" +
                    "                    `");
        }

        yourPokemon(pokemon);
        int chose = sc.nextInt() - 1;
        pokemon[chose].setLife(25);
        wild[randPokemon].setLife(25);
        System.out.println("You chose : " + pokemon[chose].getName() + " !");
        int lifeCapture = wild[randPokemon].getLife() / 4;
        while (pokemon[chose].getLife()>0 && wild[randPokemon].getLife()>0) {

            pokemon[chose].takeHit(wild[randPokemon]);

            if (pokemon[chose].getLife() <= 0) {
                System.out.println("You LOOSE !");
                break;
            }
            wild[randPokemon].takeHit(pokemon[chose]);

            if (wild[randPokemon].getLife() > 0 && wild[randPokemon].getLife() <= lifeCapture) {
                System.out.println("\nThe wild pokemon is weak, try your chance to capture him: (yes to throw a pokeball)");
                Scanner stringsc = new Scanner(System.in);
                String choice = stringsc.nextLine();

                if (choice.equalsIgnoreCase("yes")) {
                    int capture = rand.nextInt(3);
                    if (capture == 2) {
                        System.out.println("Congratulations ! You have captured: " + wild[randPokemon].getName());

                        pokemon = pokeAdded(pokemon, wild[randPokemon]);

                        break;
                    } else {
                        System.out.println(wild[randPokemon].getName() + " has dodge the ball! ");
                    }
                }
            }
            if (wild[randPokemon].getLife()<= 0){
                System.out.println("You win !");
            }
        }

        } while(reMatch());

    }

    public static Monster[] pokeAdded (Monster [] pokemon,Monster get) {

        Monster[] pokemon1 = new Monster [pokemon.length+1];
        for (int i = 0; i < pokemon1.length; i++) {
            if (i< pokemon.length) {
                pokemon1[i] = pokemon[i];
            }else{
                pokemon1[i] = get;
            }

        }
        return pokemon1;
    }

    public static void yourPokemon (Monster[] pokemon){
        System.out.println("Choose your pokemon :");
        int j = 1;
        for (int i = 0; i<pokemon.length; i++) {
            System.out.print(j + ": " + pokemon[i].getName() + "  ");
            j++;
        }
        System.out.println("");
    }

    public static boolean reMatch () {

        System.out.println("Do you want to replay ? Yes or No");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }
}
