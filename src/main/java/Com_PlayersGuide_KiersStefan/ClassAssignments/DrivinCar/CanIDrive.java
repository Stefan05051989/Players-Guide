package Com_PlayersGuide_KiersStefan.ClassAssignments.DrivinCar;

/*
Stefan Kiers
.1-07-2025

Write a program that tells you whether you are allowed to drive a car:
- Are you 18+ and do you have a driver's license? Then you are allowed to drive.
- Are you <18 and do you have a driver's license? Then you are allowed to drive under supervision.
- Do you not have a driver's license? Then you are never allowed to drive.
    Write the correct if/else-statement for this
 */

import java.util.Scanner;

public class CanIDrive {
    public static void main(String[] args) {
        // variables :
        int age = 19;
        boolean license = true;

        if (license && age > 18){
            System.out.println("You can drive.");
        } else if (age < 18 && age > 16) {
            System.out.println("You can't drive without supervision.");
        }else {
            System.out.println("You can't drive.");
        }
    }
}
