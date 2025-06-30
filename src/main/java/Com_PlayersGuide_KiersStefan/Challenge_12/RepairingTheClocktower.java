package Com_PlayersGuide_KiersStefan.Challenge_12;
import Com_PlayersGuide_KiersStefan.Utils.AskForNumber.NumberInRange;

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
        int userInput = NumberInRange.AskForNumber("Enter a number between ", 0, " and ", 59, " : ");

        // use if statement to check if condition is odd or even :
        if (userInput % 2 == 0){
            System.out.println("Tick");
        }else {
            System.out.println("Tock");
        }
    }
}
