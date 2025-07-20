package Com_PlayersGuide_KiersStefan.ClassAssignments.WholePositiveNumber;

/*
Stefan Kiers
6-7-'25

number in range form int method
 */

import Com_PlayersGuide_KiersStefan.Challenge_20.TakingANumber;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        // scanner input
        Scanner askForWholeInput = new Scanner(System.in);
        // import method from excisting class
        int inputNumber = TakingANumber.AskForNumber(-2147483648,
                2147483647);
        // ERROR! i've activated 2 scanner objects. 1ste one in the NIR.AFN class / method, secondly here in the IWN class,
        // when these 2 operate on the same function it creates an error because the NIR.AFN creates it's own scanner
        // object internally. Both scanners are reading sout simultaniously at that moment.
        //askForWholeInput.nextInt();
        // print inputNumber
        System.out.println("Input by user : " + inputNumber);
        askForWholeInput.close();
    }
}
