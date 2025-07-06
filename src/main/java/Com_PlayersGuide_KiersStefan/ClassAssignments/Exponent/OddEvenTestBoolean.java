package Com_PlayersGuide_KiersStefan.ClassAssignments.Exponent;

/*
Stefan Kiers
06-07-25

Write a boolean method called isOdd() in a class called OddEvenTest,
 that takes an int as input and returns true if it is odd.
 */

import java.util.Scanner;

public class OddEvenTestBoolean {
    public static void main(String[] args) {
        // input scanner
        Scanner scanner = new Scanner(System.in);
        // call boolean method
        OddEvenTestBoolean oddOrEven = new OddEvenTestBoolean();
        //print numbers to check if output is correct. (5 = odd = true, 6 = even = false)
        System.out.println("5 is odd : " + oddOrEven.isOdd(5));
        System.out.println("6 is odd : " + oddOrEven.isOdd(6));
        System.out.println("7 is odd : " + oddOrEven.isOdd(7));
        System.out.println("8 is odd : " + oddOrEven.isOdd(8));
        System.out.println("0 is odd : " + oddOrEven.isOdd(0));
    }

    // method for determining if int is odd or even.
    public boolean isOdd(int number) {
        return number % 2 == 1;
    }
//    // made a second method for the even calculation
//    public boolean isEven(int number){
//        return number % 2 == 0;
}

