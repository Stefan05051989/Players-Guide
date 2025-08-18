package Com_PlayersGuide_KiersStefan.Challenge_20;
import java.util.Scanner;

/*
Stefan Kiers
20-07-'25

Create a method that asks for a number in range, use this method in different classes.
Should be with text, but kept it dry so text variables can be put in class itself which calls
the method.
 */

public class TakingANumber {
    public static int AskForNumber(Scanner scanner, String text, Integer baseValue, Integer maxValue) {
        int inputInteger;

        do {
            System.out.println(text + baseValue + " to " + maxValue + " : ");
            inputInteger = scanner.nextInt();

            if (inputInteger < baseValue || inputInteger > maxValue) {
                System.err.println("Invalid input, try again.");
            }
        }
        while (inputInteger < baseValue || inputInteger > maxValue);
        //scanner.close();
        return inputInteger;
    }
}
