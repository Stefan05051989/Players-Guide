package Com_PlayersGuide_KiersStefan.ClassAssignments.WholePositiveNumber;

/*
Stefan Kiers
08-07-'25
Method for entering natural positive number :
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NaturalPositiveNumber {
    public static ArrayList<Integer> AskPositiveNumber() { // give scanner as parameter in method
        Scanner scanner = new Scanner(System.in);
        //Instantiate arraylist.
        ArrayList<Integer> myInput = new ArrayList<>();
        //ask user for input
        System.out.println("Enter items to store in arraylist (int only), complete by typing : X");
        // store scanner in while loop so it can add the integers
        while (scanner.hasNextInt()){
            myInput.add(scanner.nextInt());
        }
        // now store Iterator function in myInput.
        System.out.println("Input ArrayList : ");
        // while they are stored as user input, UNTIL it recieves anything else then integers.
        Iterator<Integer> iterator = myInput.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        scanner.close();
        return myInput;
    }
}

