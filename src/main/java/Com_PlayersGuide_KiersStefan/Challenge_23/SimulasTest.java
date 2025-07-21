package Com_PlayersGuide_KiersStefan.Challenge_23;
import java.util.Scanner;

import static Com_PlayersGuide_KiersStefan.Challenge_20.TakingANumber.scanner;

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
        ChestStateClass.ChestState currentState = ChestStateClass.ChestState.LOCKED;
        /*
        And enum is a special class (enumerated / ordered listing) that represents a group of constants (final variables).
        To create enum, use the keyword and seperate the constants with a comma.
        all UPPERCASE!
         */

        while (true) {
            System.out.println("The chest is " + currentState + ". What do you want to do?");
            String userInput = scanner.nextLine();

            if (currentState == ChestStateClass.ChestState.LOCKED && userInput.equals("unlock")) {
                currentState = ChestStateClass.ChestState.CLOSED;
            }
            if (currentState == ChestStateClass.ChestState.CLOSED && userInput.equals("open")) {
                currentState = ChestStateClass.ChestState.OPEN;
            }
            if (currentState == ChestStateClass.ChestState.OPEN && userInput.equals("close")) {
                currentState = ChestStateClass.ChestState.CLOSED;
            }
            if (currentState == ChestStateClass.ChestState.CLOSED && userInput.equals("lock")) {
                currentState = ChestStateClass.ChestState.LOCKED;
            }
            // return; TEST : with return statement, enum is only executed ones!
        }
    }
    static final class ChestStateClass {
        enum ChestState {
            OPEN, CLOSED, LOCKED;
        }
    }
}
