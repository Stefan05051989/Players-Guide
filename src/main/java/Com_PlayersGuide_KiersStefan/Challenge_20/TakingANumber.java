package Com_PlayersGuide_KiersStefan.Challenge_20;

/*
Stefan Kiers
20-07-'25

Create a method that asks for a number in range, use this method in different classes.
Should be with text, but kept it dry so text variables can be put in class itself which calls
the method.
 */

import java.util.Scanner;

public class TakingANumber {
    public static Scanner scanner = new Scanner(System.in); // tried scanner in psi AFN but didn't work because of signature.
    public static int AskForNumber(String text, int baseValue, int maxValue) {
        int number;
        boolean onlyPrintOnce = true;

        while (true) {
            try {
                // empty parameter.
                if (onlyPrintOnce) {
                    if (text == null || text.trim().isEmpty()) {
                        System.out.println(text + " between " + baseValue + " and " + maxValue + " : ");
                    } else {
                        System.out.println("Enter a number between " + baseValue + " and " + maxValue + " : ");
                    }
                    onlyPrintOnce = false;
                }else {
                    System.out.println(text + " between " + baseValue + " and " + maxValue + " : ");
                }
                String input = scanner.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("No input, check parameters. ");
                }
                number = Integer.parseInt(input.trim());
                if (number >= baseValue && number <= maxValue){
                    return number;
                }else {
                    System.out.println("Invalid input, try again.");
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid input, only use integers between 0 and 100.");
            }
        }
    }
    public static void closeScanner(){
        scanner.close();
    }
}
