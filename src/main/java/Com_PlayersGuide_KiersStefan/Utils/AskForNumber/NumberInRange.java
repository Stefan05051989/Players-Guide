package Com_PlayersGuide_KiersStefan.Utils.AskForNumber;
import java.util.Scanner;

/*
Stefan Kiers
29-06-'25

Create a method that asks for a number in range, use this method in different classes.
 */


public class NumberInRange {
    public static int AskForNumber(String text, int minRange, int maxRange) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        int input;
        do {
            while (!scanner.hasNextInt()){
                System.out.println("Invalid input, try again.");
                scanner.next();
            }
            input = scanner.nextInt();
            if (input < minRange || input > maxRange){
                System.out.printf("Number must be between %d and %d, try again : ", minRange,maxRange);
            }while (input < minRange || input > maxRange);
        }while (input < minRange || input > maxRange);
        // sout to check if output is valid, works.
        // System.out.println("Valid input : " + input);
        return input;


    }
}
