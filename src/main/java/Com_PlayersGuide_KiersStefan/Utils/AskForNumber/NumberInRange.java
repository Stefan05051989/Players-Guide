package Com_PlayersGuide_KiersStefan.Utils.AskForNumber;
import java.util.Scanner;

/*
Stefan Kiers
29-06-'25

Create a method that asks for a number in range, use this method in different classes.
 */


public class NumberInRange {
    public static int AskForNumber(int baseValue, int maxValue) {
        Scanner scanner = new Scanner(System.in);
       // System.out.print(text);
        int input;
        do {
            while (!scanner.hasNextInt()){
                System.out.print("Invalid input, try again : ");
                scanner.next();
            }
            input = scanner.nextInt();
            if (input < baseValue || input > maxValue){
                System.out.printf("Number must be between %d and %d, try again : ", baseValue, maxValue);
            }while (input < baseValue || input > maxValue);
        }while (input < baseValue || input > maxValue);
        // sout to check if output is valid, works.
        // System.out.println("Valid input : " + input);
        return input;


    }
}
