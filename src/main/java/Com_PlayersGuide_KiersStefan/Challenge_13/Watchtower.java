package Com_PlayersGuide_KiersStefan.Challenge_13;

/*
Stefan Kiers
29-06-'25

Ask the user for an x value and a y value. These are coordinates of
the enemy relative to the watchtower’s location. Positive x-values are east, positive y-values are north (as they would be on a normal graph)
Using if statements and relational operators, display a message about what direction the enemy is coming from.
For example, “The enemy is to the northwest!” or “The enemy is here!

if : input is less / more than var, output location.
operators :
> = Greater then
< = Less than
== Equal to
&& = Returns true when both statements are true.

                            X
                x < 0       x = 0       x > 0
        y > 0     NW          N           NE

    Y   y = 0     W           ! (0)       E

        y < 0     SW          S           SE
 */

import java.util.Scanner;

public class Watchtower {
    public static void main(String[] args) {
        // scanner for input
        Scanner scanner = new Scanner(System.in);
        // declare variables for directions
        String north = "North";
        String east = "East";
        String south = "South";
        String west = "West";
        String northEast = "North-East";
        String northWest = "North-West";
        String southEast = "South-East";
        String southWest = "South-West";


        // ask user for input : X/Y values (X rows (vertical), Y columns (horizontal)).
        System.out.println("What row is the enemy ?");
        int X = scanner.nextInt();
        System.out.println("What column is the enemy ?");
        int Y = scanner.nextInt();

        // if enemy is at location :
        if (X == 0 && Y == 0){
            System.out.println("The enemy is here!");
        } else if (X < 0 && Y == 0) {
            System.out.println("The enemy is " + north);
        } else if (X > 0 && Y == 0) {
            System.out.println("The enemy is " + south);
        } else if (X == 0 && Y > 0) {
            System.out.println("The enemy is " + east);
        } else if (X == 0 && Y < 0) {
            System.out.println("The enemy is " + west);
        } else if (X < 0 && Y > 0) {
            System.out.println("The enemy is " + northEast);
        } else if (X < 0 && Y < 0) {
            System.out.println("The enemy is " + northWest);
        } else if (X > 0 && Y > 0) {
            System.out.println("The enemy is " + southEast);
        } else if (X > 0 && Y < 0) {
            System.out.println("The enemy is " + southWest);
        }
        scanner.close();
    }
}
