package Com_PlayersGuide_KiersStefan.Challenge_04;
import java.util.Scanner;
/*
Stefan Kiers
24-06-'25

Telim will share his bread with the city if you can build a program that
lets him enter the names of those receiving it.

A sample run of this program looks like this:

Bread is ready.
Who is the bread for?
RB
Noted: RB got bread.

Make a program that runs as shown above, including taking a name from the user
 */

public class ConsolasAndTelim {
    public static void main(String[] args) {

        // create scanner Object!
        // This create an object from the scanner class, so it can be used in various ways.
        Scanner myObject = new Scanner(System.in);
        // declare local variables.
        String theBaker = "The Baker";
        String nextCustomer = "";

        System.out.println(theBaker + " says : The bread is ready!");
        System.out.println("Who is the bread for?");

        // Declaration is also possible here :
        // read user input : this is where the user answers to recieve the bread.
        String customerForBread = myObject.nextLine();
        System.out.println("Noted : " + customerForBread + " got the bread!");
        System.out.println(customerForBread + " says : thanks!");
        System.out.println(theBaker + "says : Who's next?");

        nextCustomer = myObject.nextLine();
        System.out.println("What would you like to have " + nextCustomer + " ?");
        System.out.println(nextCustomer + " would like to have 2 loafs of bread.");
        System.out.println(theBaker + " hands over the bread.");
        System.out.println("Enjoy your day.");

        myObject.close();
    }
}
