package Com_PlayersGuide_KiersStefan.ClassAssignments.Palindroom;

/*
Stefan Kiers
07-07-'25

Give a random string as input and reverse.
Also, check if palindrome.

option 1 : use stringbuilder to reverse.
option 2 : for loop
 */

import java.util.Scanner;

public class Palindroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // import scanner
        System.out.println("Enter input to reverse String : ");//ask user for input :
        String originalString = scanner.nextLine();// store input in variable.
        StringBuilder stringBufferMethod = new StringBuilder(originalString); // call stringbuilder method
        stringBufferMethod.reverse(); // method . reverse
        System.out.println(stringBufferMethod); // print buffered method

        // different approach
        StringBuilder reversedString = new StringBuilder();
        for (int i = 0; i <originalString.length(); i++){
            reversedString.insert(0, originalString.charAt(i));
        }
        System.out.println(reversedString);

        // Bonus, check if palindrome.
        if (reversedString.toString().equals(originalString)){
            System.out.println("Palindrome : Yes!");
        }else {
            System.out.println("Palindrome : No.");
        }
    }
}
