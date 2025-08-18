package Com_PlayersGuide_KiersStefan.Challenge_16;
import Com_PlayersGuide_KiersStefan.Challenge_20.TakingANumber;
import Com_PlayersGuide_KiersStefan.Utils.ClearConsole.ClearConsole;
import java.util.Scanner;

/*
Stefan Kiers
17-07-2025

Objectives :

Build a program that will allow a user, the pilot, to enter a number.
If the number is above 100 or less than 0, keep asking.
Clear the screen once the program has collected a good number (you can just write 50 blank lines to clear the screen :) ).
Ask a second user, the hunter,to guess numbers.
Indicate whether the user guessed too high, too low, or guessed right.
Loop until they get it right, then end the program.
 */


public class ThePrototype {
    public static void main(String[] args) {

        // call ask for number in range method, parameters 0 to 100. ( if > 100, keep asking)
        int numberToGuess = TakingANumber.AskForNumber(new Scanner(System.in),"Enter a number between  ", 0, 100);
        ClearConsole.clearConsole(); // clear console (create method, 25 blank lines)
        /*
        System.out.print("\033[H\033[2J");
        System.out.flush();
        */

        Scanner scanner = new Scanner(System.in);
        // Start game.
        System.out.println("The Manticore's ship must be located between 0 and 100!");
        System.out.println("You only have 15 chances before the city is destroyed, good luck!");
        System.out.println("Hunter, guess the location of The Manticore : ");

        int userGuess = -1;
        int attempts = 0;

        while (userGuess != numberToGuess && attempts < 15) {
            System.out.println("Enter your guess : ");
            try {
                if (scanner.hasNextInt()) {
                    userGuess = scanner.nextInt();
                    attempts++;

                    if (userGuess < numberToGuess) {
                        System.out.println("Too Low, guess again..");
                    } else if (userGuess > numberToGuess) {
                        System.out.println("Too high, guess again..");
                    } else {
                        System.out.println("HIT!");
                        System.out.println("You brought X damage to The Manticore.");
                        break;
                    }

                } else {
                    System.out.println("Please enter a valid number");
                    scanner.next(); // consume invalid input the prevent infinite loop.
                }
            } catch (Exception e) {
                System.out.println("input error");
                scanner = new Scanner(System.in);
            }
        }

        if (attempts <= 15 && userGuess != numberToGuess){
            System.out.println("the city is destroyed, The Manticore has won..");
        }
        scanner.close();
    }
}
