package Com_PlayersGuide_KiersStefan.Challenge_11;
/*
Stefan Kiers
26-06-'25

Assignment :

 Ask the user for the target row and column.
 Compute the neighboring rows and columns of where to deploy the squad.
 Display the deployment instructions in a different color of your choosing.
 Play a sound with Toolkit.getDefaultToolkit().beep(); when the results have been computed and displayed.

 */


import Com_PlayersGuide_KiersStefan.Utils.Colours.Colours;

import java.awt.*;
import java.util.Scanner;

public class DefenseOfConsolas {
    public static void main(String[] args) {
        // Ask user for input (target & row) :
        Scanner scanner = new Scanner(System.in);
        System.out.println("What row will the attack be in : ");
        int row = scanner.nextInt();
        System.out.println("What column will the attack be in : ");
        int column = scanner.nextInt();

        // Display attack
        System.out.println(Colours.BLUE + "(" + row + "," + (column+1) + ")" + Colours.RESET);
        System.out.println(Colours.YELLOW + "(" + row + "," + (column-1) + ")" + Colours.RESET);
        System.out.println(Colours.RED + "(" + (row+1) + "," + column + ")" + Colours.RESET);
        System.out.println(Colours.GREEN + "(" + (row-1) + "," + column + ")" + Colours.RESET);
        // Play beep sound through toolkit
        Toolkit.getDefaultToolkit().beep();
    }
}

