package Com_PlayersGuide_KiersStefan.Challenge_16;
import Com_PlayersGuide_KiersStefan.Challenge_20.TakingANumber;
import Com_PlayersGuide_KiersStefan.Utils.ClearConsole.ClearConsole;

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

import java.util.Scanner;

public class ThePrototype {
    public static void main(String[] args) {
        // import scanner
        // call ask for number in range method, parameters 0 to 100. ( if > 100, keep asking)
        // clear console (create method, 25 blank lines)
        // add second user, hunter, to guess numbers.
        // indicate too high, too low, or correct.
        // loop until they get it right (while true) then exit.

        Scanner scanner = new Scanner(System.in);
        // startvalue (0)
        int userGuess = -1;


        System.out.println("Fill in the number you want the hunter to guess : ");
        int numberToGuess = TakingANumber.AskForNumber(0, 100);
        if (numberToGuess > 0 || numberToGuess < 100) {
            System.out.println("Hunter needs to guess : " + numberToGuess);
        }
        ClearConsole.clearConsole();
        // System.out.print("\033[H\033[2J");
        // System.out.flush();
        System.out.println("Hunter, guess the number between 0 & 100!");
        while (userGuess != numberToGuess){
            if (scanner.hasNextInt()){
                userGuess = scanner.nextInt();
                if (userGuess < numberToGuess){
                    System.out.println("Too Low, guess again..");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high, guess again..");
                }else {
                    System.out.println("Correct!");
                    System.out.println("Number guessed!");
                }
            }
        }
        scanner.close();
    }
}
