package Com_PlayersGuide_KiersStefan.Challenge_23;
import java.util.Scanner;


/*
Stefan Kiers
21-07-'25


The chest is a small box you can hold in your hand. The lid can be open, closed (but unlocked), or locked.
You’d normally be able to go between these states, opening, closing, locking, and unlocking the box, but
the box is broken.You need to create a program with an enumeration to recreate this locking mechanism.
Nothing happens if you attempt an impossible action in the current state, like opening a locked box.

 - Define an enumeration for the state of the chest.
 - Make a variable whose type is this new enumeration.
 - Write code to allow you to manipulate the chest with the lock, unlock, open, and close commands, but ensure that
    you don’t transition between states that don’t support it.
 - Loop forever, asking for the next command.

The program below shows what using this might look like:
The chest is locked. What do you want to do? unlock
The chest is unlocked. What do you want to do? open
The chest is open. What do you want to do? close
The chest is unlocked. What do you want to do?

 */


public class SimulasTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChestState currentState = ChestState.LOCKED;

        /*
        And enum is a special class (enumerated / ordered listing) that represents a group of constants (final variables).
        To create enum, use the keyword and seperate the constants with a comma.
        all UPPERCASE!
         */

        while(true) {
            System.out.println("The chest is " + currentState + "\nWhat do you want to do? (open, close, lock, unlock)");
            String userInput = scanner.nextLine();
            System.out.println("User choice : " + userInput.toUpperCase());

            if (currentState == ChestState.LOCKED && userInput.equals("unlock")) {
                currentState = ChestState.CLOSED;
            }
            else if (currentState == ChestState.CLOSED && userInput.equals("open")) {
                currentState = ChestState.OPEN;
            }
            else if (currentState == ChestState.OPEN && userInput.equals("close")) {
                currentState = ChestState.CLOSED;
            }
            else if(currentState == ChestState.CLOSED && userInput.equals("lock")) {
                currentState = ChestState.LOCKED;
            }
             //return; TEST : with return statement, enum is only executed ones!
        }
    }
}
enum ChestState {
    OPEN("open"), CLOSED("closed"), LOCKED("locked");

    private String description;
    private ChestState(String description){
        this.description = description;
    }
}

class ChestStateTwo{
    public static final ChestStateTwo OPEN = new ChestStateTwo("open", 1);
    public static final ChestStateTwo CLOSED = new ChestStateTwo("closed", 2);
    public static final ChestStateTwo LOCKED = new ChestStateTwo("locked", 3);

    private String state;
    private int priority;
    private ChestStateTwo(String state, int priority) {
        this.state = state;
        this.priority = priority;
    }
    @Override
    public String toString(){
        return state;
    }
}


