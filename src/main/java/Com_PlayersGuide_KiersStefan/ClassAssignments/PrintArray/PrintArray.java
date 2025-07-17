package Com_PlayersGuide_KiersStefan.ClassAssignments.PrintArray;
import Com_PlayersGuide_KiersStefan.ClassAssignments.WholePositiveNumber.NaturalPositiveNumber;

/*
Stefan Kiers
08-07-'25

Write a program called PrintArray that asks the user for the
number of items in an array (a non-negative integer) and stores it in an int variable called NUM_ITEMS.
 It then asks the user for the values of all the items and stores them in an int array called
items. The program will then print the contents of the array in the form of [x1, x2, ..., xn]

Bonus :
Have the program print the contents of the array in a graphical form,
 with the values represented by the number of stars.
 (Example :
 *** (3)
 **(2)
 *(1)
 */


import java.util.ArrayList;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        // call / instatiate method + signature from Natural number classs
        ArrayList<Integer> userInput = NaturalPositiveNumber.AskPositiveNumber();
        // print array to string method for printing as array
        Integer[] array = userInput.toArray(userInput.toArray(new Integer[0]));
        System.out.println("Input from user : " + userInput);
    }
}
