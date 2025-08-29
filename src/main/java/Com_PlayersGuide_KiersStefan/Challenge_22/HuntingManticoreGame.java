package Com_PlayersGuide_KiersStefan.Challenge_22;
import Com_PlayersGuide_KiersStefan.Challenge_16.ThePrototype;
import Com_PlayersGuide_KiersStefan.Challenge_17.TheMagicCanon;
import Com_PlayersGuide_KiersStefan.Challenge_22.TakingANumberHTM;
import Com_PlayersGuide_KiersStefan.Utils.Colours.Colours;
import java.util.Scanner;

/*
Stefan Kiers
20-07-2025

2 player main : Hunting the Manticore

Objectives :
1 : determine distance of Manticore from city (0 to 100)
2 : repeatedly try to hit the manticore
3 : each attempt, tell if fell short, overshot or hit the manticore.
4 : damage dealt depends on turn number (normal 1, fire 3, electric 5, combo 10)
5 : manticore is destroyed after taking 10 points of damage (manticore health is 10)
6 : if manticore survives a turn, city will take 1 point of damage.
(city health is 15).
7 : before round begins, print status like so :
-----------------------------------------------------------
STATUS: Round: 1 City: 15/15 Manticore: 10/10
The cannon is expected to deal 1 damage this round.
Enter desired cannon range: 50
That round OVERSHOT the target.
-----------------------------------------------------------
player 1 places manticore (then clear console)
player 2 tries defeating it.

 */


public class HuntingManticoreGame {
    public static void run() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int manticoreLocation = ThePrototype.ManticoreLocation();

        // declare variables :
        int cityHealth = 15;
        int manticoreHealth = 10;
        int round = 1;
        TheMagicCanon canon = new TheMagicCanon();

        while (cityHealth > 0 && manticoreHealth > 0){
            showStatus(round, manticoreHealth, cityHealth);

            TheMagicCanon.Blast blast = canon.fire();
            System.out.println("Canon is expected to deal " + blast.damage + " this round!");
            int target = TakingANumberHTM.AskForNumber(scanner,"Guess the location for the manticore ", 0, 100);

                if (target < manticoreLocation) {
                    System.out.println("Too low, guess again!");
                } else if (target > manticoreLocation) {
                    System.out.println("Too high, guess again!");
                } else {
                    System.out.println(blast.discription);
                    manticoreHealth -= blast.damage;
                    if (manticoreHealth <= 0){
                        System.out.println("The Manticore is destroyed! You saved the city!");
                        break;
                    }
                }
                if (manticoreHealth > 0){
                    cityHealth --;
                    if (cityHealth <= 0){
                        cityHealth = 0;
                        System.out.println("The city is destroyed, The Manticore won.");
                        System.out.println(Colours.RED + "\n\n \u001B[1m - * GAME OVER! * - \n\n " + Colours.RESET);
                        break;
                    }
                }
                round++;
                System.out.println();
            }
        scanner.close();
        }
    private static void showStatus(int round, int manticoreHealth, int cityHealth) {
        System.out.println("----------------------------------------------------------");
        System.out.println("Round : " + round);
        System.out.println("Manticorehealth : " + manticoreHealth);
        System.out.println("Cityhealth : " + cityHealth);
        System.out.println("----------------------------------------------------------");
    }
}
