package Com_PlayersGuide_KiersStefan.Challenge_18;

/*
Stefan Kiers
17-07-2025


Make a program that creates an array of length 5.
Ask the user for five numbers and put them in the array.
Make a second array of length 5.
Use a loop to copy the values out of the original array and into the new one.
Display the contents of both arrays one at a time to illustrate that the Replicator of D’To works again.

 */

import java.util.Arrays;
import java.util.Scanner;

public class TheReplicatorOfDTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create array with a length of 5
        System.out.println("Enter 5 Integers to put in an array : ");
        // create array of 5 int's with user input.
        int[] replicator = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
                scanner.nextInt(), scanner.nextInt()};

        // new array with space for 5 integers
        int[] replicator2 = new int[5];
        // loop copies the integers from replicator in reverse order
        for (int i = 0; i < replicator.length; i++){
            replicator2[i] = replicator[replicator.length -1 -i];
        }

        // print statements for both the normal and flipped array.
        System.out.println("Original array : " + Arrays.toString(replicator));
        System.out.println("Flipped array : " + Arrays.toString(replicator2));
    }
}
