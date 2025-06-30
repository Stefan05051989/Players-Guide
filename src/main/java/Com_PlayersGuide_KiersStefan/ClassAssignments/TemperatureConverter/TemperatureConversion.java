package Com_PlayersGuide_KiersStefan.ClassAssignments.TemperatureConverter;
import java.util.Scanner;

/*
Stefan Kiers
28-06-'25

Create a program that converts fahrenheit to celsius and visa versa.

 */



public class TemperatureConversion {
    public static void main(String[] args) {
        // Import scanner for user input
        Scanner input = new Scanner(System.in);
        //User picks temperature to convert.
        System.out.println("Pick your base temperature : 1 - Fahrenheit, 2 - Celsius. " );
        // choice = input for temperature
        int choice = input.nextInt();

        // if / else statement for options
        if (choice == 1) {
            System.out.println("What's the temperature in Fahrenheit : ");
            // put user input in variable
            float fahrenheit = input.nextFloat();
            // use input value to calculate using formula : fahrenheit minus 32 divided by 1.8
            float celsius = (fahrenheit -32) / 1.8f;
            // display output
            System.out.println("It's " + celsius + " degrees Celsius.");
        } else {
            System.out.println("What's the temperature in Celsius :  ");
            float celcius = input.nextFloat();
            if (celcius <= -273) {
                System.out.println("Temperature can not be lower then -273 celsius");
                return;
            }
            float fahrenheit = (celcius +32) * 1.8f;
            System.out.println("It's " + fahrenheit + " degrees Fahrenheit.");
        }
        input.close();
    }
}
