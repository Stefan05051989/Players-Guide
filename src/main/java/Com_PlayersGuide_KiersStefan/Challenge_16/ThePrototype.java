package Com_PlayersGuide_KiersStefan.Challenge_16;
import Com_PlayersGuide_KiersStefan.Challenge_20.TakingANumber;
import Com_PlayersGuide_KiersStefan.Challenge_21.Countdown;
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
    public static int ManticoreLocation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User 1, determine the location for The Manticore.");
        // call ask for number in range method, parameters 0 to 100. ( if > 100, keep asking)
        int numberToGuess = TakingANumber.AskForNumber(scanner,
                "Enter a number between  ", 0, 100);
        int locationManticore = numberToGuess;
        // if number < 0 || > 100, keep asking
        if (numberToGuess < 0 || numberToGuess > 100) {
            System.out.println("Invalid input.");
            System.out.println("Enter a number between 0 and 100");
        } else {
            // if correct, start run
            System.out.println("The Game starts in...");
            Countdown.baseForRecursion(5);
            ClearConsole.clearConsole(); // edited a countdown function for Thread.sleep before clearing console.
        }
        return locationManticore;
    }
}
