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
    public static int AskForNumber(int baseValue, int maxValue) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            while (!scanner.hasNextInt()){
                System.out.print("Invalid input, try again : ");
                scanner.next();
            }
            input = scanner.nextInt();
            if (input < baseValue || input > maxValue){
                System.out.printf("Number must be between %d and %d, try again : ", baseValue, maxValue);
            }
        }while (input < baseValue || input > maxValue);
        return input;
    }
}
