package Com_PlayersGuide_KiersStefan.Utils.AskForNumber;

public class Main {
    public static void main(String[] args) {
        // create local variabel to store input from user using method : int userInput
        // import method for asking number in range :
        // Import class by typing : NumberInRange, call method : .AskFor, give parameters (int) for method!
        System.out.println("User input (float) - Minimum range : 3147483648f, Maximum range : 32147483647f ");
        int userInput = NumberInRange.AskForNumber((int) -3147483648f, (int) 32147483647f);
        System.out.println("Result from input : " + userInput);
    }
}
