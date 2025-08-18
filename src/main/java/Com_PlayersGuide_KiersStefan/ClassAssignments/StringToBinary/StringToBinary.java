package Com_PlayersGuide_KiersStefan.ClassAssignments.StringToBinary;
/*

Stefan Kiers
18-08-'25
This is a program to convert String to Binary code.
 */


import java.util.Scanner;

public class StringToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word you want to convert to Binary code : ");
        String input = scanner.nextLine();
        stringToBinary(input);
        scanner.close();
    }
    static void stringToBinary(String string) {
        // store the length of the string in another variable :
        int lengthOfString = string.length();

        for (int i = 0; i < lengthOfString; i++) {
            // convert each char to ASCII value
            int asciiValue = (int) string.charAt(i); // asciiValue = value of characters at i for as long
            // as the loop works (total length of String)

            // Convert to binary :
            String binaryValue = "";
            while (asciiValue > 0) {
                if (asciiValue % 2 == 1) {
                    binaryValue += '1';
                    asciiValue /= 2;
                } else {
                    binaryValue += '0';
                    asciiValue /= 2;
                }
                binaryValue = reverse(binaryValue);
            }
            System.out.print(binaryValue + " ");
        }
    }

    private static String reverse(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }
}
