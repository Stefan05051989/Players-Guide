package Com_PlayersGuide_KiersStefan.ClassAssignments.DistanceCalculator;
import java.util.Scanner;

/*
Stefan Kiers
27 - 06 - '25
Create a program that converts distance into meters per second.

input combined in meters / seconds
 */

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the distance per meter : ");
        int myMeters = input.nextInt();
        System.out.print("What is the time in hours : ");
        int myHours = input.nextInt();
        System.out.print("What is the time in minutes : ");
        int myMin = input.nextInt();
        System.out.print("What is the time in seconds : ");
        int mySec = input.nextInt();
        System.out.println();
        System.out.println("Your time : " + myHours + ":" + myMin + ":" + mySec);

        // now convert everything to seconds :
        int totalTimeInSeconds = (myHours * 3600) + (myMin * 60) + mySec;
        System.out.println("Total in seconds : " + totalTimeInSeconds);
        System.out.println();

        // Convert meters to km
        // convert seconds to hours
        // Formula : hours * 3600 (1 hour is 3600 sec) = # of seconds per hour.
        // seconds equals : my total seconds + 60
        double speedMetersPerSec = (double) myMeters / totalTimeInSeconds;
        System.out.println("Speed = " + speedMetersPerSec + " meters per second" );

        // calculate km per hour :
        double kilometerPerHour = ((double) myMeters / 1000.0) / ((double) totalTimeInSeconds / 3600.0);
        System.out.println("Kilometer per hour = " + kilometerPerHour + " km / per hour." );
        //calculate speed in miles per hour :
        double milesPerHour = kilometerPerHour * 0.621371;
        System.out.println("Miles per hour : " + milesPerHour + " miles / per hour" );
        System.out.println();
    }
}
