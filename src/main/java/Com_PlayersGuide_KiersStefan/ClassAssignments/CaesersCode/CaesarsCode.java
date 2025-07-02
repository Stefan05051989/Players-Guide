package Com_PlayersGuide_KiersStefan.ClassAssignments.CaesersCode;

/*
Stefan kiers
30-06-'25

Write a program called CaesarCode to encode Caesar's code.
The program will prompt the user for a readable string that consists of only uppercase letters;
calculate the ciphertext; and print the ciphertext in uppercase letters.
 */

import java.util.Scanner;

public class CaesarsCode {
    public static void main(String[] args) {
        // import scanner for input
        Scanner input = new Scanner(System.in);
        // String variables (empty) for word to encrypt after user input
        String wordToEncrypt = "";
        // stringbuilder (builds a string based on individual chars in the word to encrypt
        StringBuilder outputWord = new StringBuilder();

        System.out.println("Enter the message you want to encrypt : ");
        // word to encrypt -> to capital letters after input from user
        wordToEncrypt = input.nextLine().toUpperCase();

        // using the askii table to define the correct chars to build in the stringbuilder.
        for (int i = 0; i < wordToEncrypt.length(); i++){
            int number = wordToEncrypt.charAt(i);
            // started with the wrong numbers (64) en ended with 91, so the encryption wasnt correct.
            // adapted the start en endpoint so the output with testing is now : WHVWLQJ
            if (number > 65 && number < 90){
                number = number + 3;
                if (number > 90){
                    number = number - 26;
                }
            }
            // define input of chars after word input from string : number = char = new char.
            char charNew = (char) (number);
            // output word, offset -> start at 0! to new char (char + 3 from askii table)
            outputWord.insert(0, charNew);
        }
        // output outcome.
        System.out.println("The encryptmessage is : " + outputWord);
    }
}
