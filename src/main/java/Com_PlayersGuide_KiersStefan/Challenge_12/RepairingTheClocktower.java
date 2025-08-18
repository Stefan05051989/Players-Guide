package Com_PlayersGuide_KiersStefan.Challenge_12;
import Com_PlayersGuide_KiersStefan.Challenge_20.TakingANumber;

import java.util.Scanner;

/*
Stefan Kiers
29-06-'25

- Take a number as input from the console.
- Display the word “Tick” if the number is even. Display the word “Tock” if the number is odd.
- Hint: Remember that you can use the remainder operator to determine if a number is even or odd.
 */


public class RepairingTheClocktower {
    public static void main(String[] args) {
        // import class NumberInRange to ask for user input, declare parameters as 1 to 60 (clock base)
        System.out.println("Repairing the Clocktower.");
        System.out.println("Check if a number is even or odd.");

        int inputInteger = TakingANumber.AskForNumber(new Scanner(System.in), "hoi", 0, 100);

        // use if statement to check if condition is odd or even :
        if (inputInteger % 2 == 0){
            System.out.println("Tick (even)");
        }else {
            System.out.println("Tock (odd)");
        }
    }
}
