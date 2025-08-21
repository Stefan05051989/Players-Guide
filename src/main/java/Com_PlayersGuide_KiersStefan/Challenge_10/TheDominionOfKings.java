package Com_PlayersGuide_KiersStefan.Challenge_10;
import java.util.Scanner;

/*
Stefan Kiers
24-06-'25

Create a program that allows users to enter how many provinces, duchies, and estates they have.
Add up the user’s total score, giving 1 point per estate, 3 per duchy, and 6 per province.
Display the point total to the user.

Later : use exception handeling to improve program for negative input

 */


public class TheDominionOfKings {
    public static void main(String[] args) {
        // create scanner object
        Scanner scanner = new Scanner(System.in);
        // declare variables
        String kingMelik = "Melik";
        String kingCasik = "Casik";
        String kingBalik = "Balik";
        // boolean for returning to startingpoint of the run.
        boolean repeat = true;
        String selectedKing;

        // To restart the program when finished. Wrap the entire program in a boolean with repeat set to true.
        // This way you can choose at the bottom of the program the exit or restart / edit the data.
        // Also : adjust the input to sum up the total of all three kings, not just the one used for user input now.
        while (repeat) { // while -> boolean is true  ( start again, if false, end program (line 76)
            System.out.println("What is your name?" + "\n" + "Enter 1: " + kingMelik + "\n" + "Enter 2: "
                               + kingCasik + "\n" + "Enter 3: " + kingBalik);
            System.out.print("Your choice : ");
            int input = scanner.nextInt();
//            String selectedKing;

            switch (input) {
                case 1:
                    selectedKing = kingMelik;
                    break;
                case 2:
                    selectedKing = kingCasik;
                    break;
                case 3:
                    selectedKing = kingBalik;
                    break;
                default:
                    selectedKing = "Unknown.";
            }

            if (selectedKing.equalsIgnoreCase("Unknown")) {
                System.out.println("Invalid selection" + "\n" + "Please select any option as stated above.");

            }else {
            System.out.println("Hello King " + selectedKing);
            }

            System.out.println("How many Estates do you have?" + "\n" + "Enter here :");
            int myEstates = scanner.nextInt();
            System.out.println("How many Duchies do you have?" + "\n" + "Enter here :");
            int myDuchies = scanner.nextInt();
            System.out.println("How many Provinces do you have?" + "\n" + "Enter here :");
            int myProvinces = scanner.nextInt();

            int totalScore = myEstates + myDuchies * 3 + myProvinces * 6;
            System.out.println("My total score is : " + totalScore);
            scanner.nextLine();

            System.out.println("Would you like to return to start? " + "\n" + "Enter Y/N : ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("You will be re-directed to the start.");
            }else{
                System.out.println("Exiting program.");
                repeat = false;
            }
        }
        // scanner was closing in the wrong part of the program, therefore it gave this exception / error :
        // Exception in thread "Exponent" java.lang.IllegalStateException: Scanner closed
        // placed the scanner at the correct position (inside Exponent instead of while loop.
        scanner.close();
    }
}
