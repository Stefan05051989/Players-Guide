package Com_PlayersGuide_KiersStefan.Challenge_16;
import Com_PlayersGuide_KiersStefan.Utils.ClearConsole.ClearConsole;
import static Com_PlayersGuide_KiersStefan.Challenge_20.TakingANumber.scanner;

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
    public static void thePrototype(int numberToGuess) {
        // import scanner
        // call ask for number in range method, parameters 0 to 100. ( if > 100, keep asking)
        // clear console (create method, 25 blank lines)
        // add second user, hunter, to guess numbers.
        // indicate too high, too low, or correct.
        // loop until they get it right (while true) then exit.
        // startvalue (0)
        ClearConsole.clearConsole();
        // System.out.print("\033[H\033[2J");
        // System.out.flush();
        System.out.println("The Manticore's ship must be located between 0 and 100!");
        System.out.println("You only have 15 chances before the city is destroyed, good luck!");
        System.out.println("Hunter, guess the location of The Manticore : ");

        int userGuess = -1;
        while (userGuess != numberToGuess) {
            System.out.println("Enter your guess : ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                if (userGuess < numberToGuess) {
                    System.out.println("Too Low, guess again..");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high, guess again..");
                } else {
                    System.out.println("HIT!");
                    System.out.println("You brought X damage to The Manticore.");
                }
            }
        }
    }
}
