package Com_PlayersGuide_KiersStefan.ClassAssignments.Fibonacci;
import static Com_PlayersGuide_KiersStefan.Utils.Fibonacci.FibonacciFormula.fibonacci;
import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        // import scanner for user input
        Scanner scanner = new Scanner(System.in);

        // ask user for whole positive (natural) number.
        System.out.println("Enter input to calculate Fibonacci sequence : ");
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
            System.out.println("Fibonacci " + fibonacci(n));

            // print sequence :
            for (int i = 0; i <= n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println();
            scanner.close();
        }
    }
}
