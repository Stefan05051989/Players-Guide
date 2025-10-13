//package Com_PlayersGuide_KiersStefan.ClassAssignments.MinutesCalculator;
//import java.util.Scanner;
//
///*
//Stefan Kiers
//27-06-'25
//
//Write a program that can convert years, months, weeks, days and hours into minutes.
//
//// logic is incorrect, years do not add up to 525.600 minutes, adapt :
// */
//
//public class MinutesCalculator {
//    public static void Products(String[] args) {
//        // scanner for input
//        Scanner scanner = new Scanner(System.in);
//        // declare variables
//        int years, months = 12, weeks = 52, days = 365, hours = 24, minutesPerHour = 60, minutes;
//
//        int yearsCalculated = (minutesPerHour * 525600);
//
//        // ask user for input for years, months, weeks, days and hours.
//        System.out.println("How many years : ");
//        Scanner input = new Scanner(System.in);
//        years = input.nextInt();
//        System.out.println("How many months : ");
//        months = input.nextInt();
//        System.out.println("How many weeks : ");
//        weeks = input.nextInt();
//        System.out.println("How many days : ");
//        days = input.nextInt();
//        System.out.println("How many hours : ");
//        hours = input.nextInt();
//
//        // now calculate the input like :
//        yearsCalculated =
//        months = months + (years * 12);
//        weeks = weeks + (months * 4);
//        days = days + (weeks * 7);
//        hours = hours + (days * 24);
//        minutes = hours * 60;
//
//        // display minutes
//        System.out.println(minutes);
//
//        input.close();
//    }
//}
