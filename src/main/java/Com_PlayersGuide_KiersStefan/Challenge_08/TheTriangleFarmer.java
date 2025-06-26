package Com_PlayersGuide_KiersStefan.Challenge_08;

/*
Stefan Kiers
24-06-'25

Write a program that lets you input the triangle’s base size and height.
Compute the area of a triangle by turning the above equation into code.
Write the result of the computation.

I've used the double variable for a more accurate method.

The formula for calculating the surface of triangle is : base * height / 2.
 */

import java.util.Scanner;

public class TheTriangleFarmer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // make a print statement and ask user input for the base of the triangle through scanner input
        System.out.println("What is the base of the Triangle?" + "\n" + "Enter base : ");
        double base = input.nextDouble();

        // make a print statement and ask the user for the height of the triangle via scanner input
        System.out.println("What is the height of the Triangle?" + "\n" + "Enter Height : " );
        double height = input.nextDouble();

        // calculate the surface via the correct formula and print it to the console.
        double surface = ((base * height) / 2);
        System.out.println(surface);

        input.close();
    }
}
