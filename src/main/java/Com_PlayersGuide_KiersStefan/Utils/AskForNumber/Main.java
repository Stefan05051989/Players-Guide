package Com_PlayersGuide_KiersStefan.Utils.AskForNumber;

public class Main {
    public static void main(String[] args) {
        // create local variabel to store input from user using method : int userInput
        // import method for asking number in range :
        // Import class by typing : NumberInRange, call method : .AskFor, give parameters (int) for method!
        int userInput = NumberInRange.AskForNumber("Enter number between ", -2147483648,
                " & ", 2147483647, " : ");
        System.out.println("Result from input : " + userInput);
    }
}
