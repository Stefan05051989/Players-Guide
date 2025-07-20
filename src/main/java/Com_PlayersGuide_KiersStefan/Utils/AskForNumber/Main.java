package Com_PlayersGuide_KiersStefan.Utils.AskForNumber;
import Com_PlayersGuide_KiersStefan.Challenge_20.TakingANumber;

public class Main {
    public static void main(String[] args) {
        // create local variabel to store input from user using method : int userInput
        // import method for asking number in range :
        // Import class by typing : NumberInRange, call method : .AskFor, give parameters (int) for method!
        System.out.println("Choose input from range :  MIN.VALUE : -2147483648, MAX.VALUE : 2147483647 ");
        int userInput = TakingANumber.AskForNumber(Integer.MIN_VALUE,  Integer.MAX_VALUE);
        System.out.println("Result from input : " + userInput);
    }
}
