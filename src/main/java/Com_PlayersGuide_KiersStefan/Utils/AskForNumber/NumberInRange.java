package Com_PlayersGuide_KiersStefan.Utils.AskForNumber;
import java.util.Scanner;

/*
Stefan Kiers
29-06-'25

Create a method that asks for a number in range, use this method in different classes.
 */


public class NumberInRange {
    public static int AskForNumber(String text, int minRange, String text2, int maxRange, String text3) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(text + minRange + text2 + maxRange + text3);
        int input;
        do {
            while (!scanner.hasNextInt()){
                System.out.println("Invalid input, try again.");
                scanner.next();
            }
            input = scanner.nextInt();
        }
        while (input < minRange || input > maxRange);
        int result = input;
        System.out.println("Valid input : " + result);
        return input;
    }
}
