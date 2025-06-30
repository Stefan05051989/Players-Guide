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
        Scanner input = new Scanner(System.in);
        String wordToEncrypt = "";
        StringBuilder outputWord = new StringBuilder();

        System.out.println("Enter the message you want to encrypt : ");

        wordToEncrypt = input.nextLine().toUpperCase();

        for (int i = 0; i < wordToEncrypt.length(); i++){
            int number = wordToEncrypt.charAt(i);
            if (number > 64 && number < 91){
                number = number + 3;
                if (number > 90){
                    number = number - 26;
                }
            }
            char charNew = (char) (number);
            outputWord.insert(0, charNew);
        }
        System.out.println("The encryptmessage is : " + outputWord);
    }
}
