package Com_PlayersGuide_KiersStefan.ClassAssignments.LucasNumber;
import static Com_PlayersGuide_KiersStefan.Utils.Lucas.LucasFormula.lucasFormula;
import java.util.Scanner;


/*
Stefan Kiers
06-07-'25

The program asks the user for a natural number n and then prints the first n so-called LucasFormula numbers.
These numbers are given by the series: 2 1 3 4 7 11 18 …
The first LucasFormula number is 2, the second is 1. After that, you get the next number by adding the two previous numbers together.
In your program, you must test whether the number typed in by the user is positive.
Furthermore, the numbers in the LucasFormula series can become so large that they no longer fit in an int.
Build a test into your program so that nothing is printed if the value of n is too large.

Understanding LucasFormula numbers :
- LucasFormula numbers form a sequence very similar to the Fibonacci sequence, but with different starting values.
 While Fibonacci starts with 0, 1, the LucasFormula sequence starts with 2, 1.

The LucasFormula number formula follows this pattern :
L (0) = 2
L (1) = 1
L(2) = L (1) + L(0) = 2 + 1 = 3.
L(3) = L (2) + L(1) = 3 + 1 = 4


The trick is to store the values constantly because a simple loop doesn't suffice for this assignment.
lucas(4)
= lucas(3) + lucas(2)
= [lucas(2) + lucas(1)] + [lucas(1) + lucas(0)]
= [[lucas(1) + lucas(0)] + 1] + [1 + 2]
= [[1 + 2] + 1] + [1 + 2]
= [3 + 1] + 3
= 4 + 3 = 7
 */


public class Lucas {
    public static void main(String[] args) {
        // import scanner for user input
        Scanner scanner = new Scanner(System.in);

        // ask user for whole positive (natural) number.
        System.out.println("Enter input to calculate LucasFormula sequence : ");
        // store input in variable n
        int n = scanner.nextInt();
        System.out.println("Number input by user : " + n);

        // check if valid input, lucas needs to be 2 or higher!
        System.out.println("Is " + n + " valid input?  ");
        if (n < 2) {
            // if smaller, not possible to calculate formula
            System.out.println("Invalid input, We can not calculate the formula for LucasFormula now.");
            System.out.println("Valid input starting at 2 or higher");
        } else {
            // 2 or higher, valid input, start method call.
            System.out.println("Valid, We can calculate the formula for LucasFormula now.");
            // call lucas method :
            System.out.println("LucasFormula " + lucasFormula(n));

            // print sequence :
            for (int i = 0; i <= n; i++) {
                System.out.print(lucasFormula(i) + " ");
            }
            scanner.close();
        }
    }
}