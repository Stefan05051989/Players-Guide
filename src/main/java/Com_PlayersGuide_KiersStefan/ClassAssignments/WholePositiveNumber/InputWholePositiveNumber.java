package Com_PlayersGuide_KiersStefan.ClassAssignments.WholePositiveNumber;
/*
Stefan Kiers
06-07-2025

Give a whole positive number: 10
sum of odd numbers up to and including 10 is 25
sum of even numbers up to and including 10 is 30
difference between two sums is -5
 */

import java.util.Scanner;

public class InputWholePositiveNumber {
    public static void main(String[] args) {
        // import scanner
        Scanner scanner = new Scanner(System.in);

        // variables for number 1 and to, also odd and even sums.
        int num1, num2;
        int oddSum = 0;
        int evenSum = 0;

        // ask user for inout
        System.out.print("Enter an even, positive number : ");
        num1 = scanner.nextInt();
        System.out.print("Enter an odd, positive number : ");
        num2 = scanner.nextInt();

        // calculate the even input from the user:
        // when int index even = 0
        for (int indexEven = 0; indexEven <= num1; indexEven += 2) {
            evenSum += indexEven;
        }
        // calculate the the odd input from the user
        for (int indexOdd = 1; indexOdd <= num2; indexOdd += 2) {
            oddSum += indexOdd;
        }

        // calculate the oddSum of even numbers up to, and including 10 :
        System.out.println("Sum of even numbers " + num1 + " : " + evenSum);
        System.out.println("Sum of odd numbers " + num2 + " : " + oddSum);
        // show difference between the two sums :
        System.out.println("Difference between even and odd : " + (oddSum - evenSum));

        scanner.close();
    }
}


