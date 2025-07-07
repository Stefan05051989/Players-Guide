package Com_PlayersGuide_KiersStefan.Challenge_14;

/*
Stefan Kiers
29-06-'25

It is time to resupply. A nearby outfitter shop has the supplies you need but is so disorganized that they
cannot sell things to you. “Can’t sell if I can’t find the price list,” Tortuga, the owner, tells you as he turns
over and attempts to go back to sleep in his reclining chair in the corner.
There’s a simple solution: use your programming powers to build something to report the prices of
various pieces of equipment, based on the user’s selection:
The following items are available:

    Rope
    Torches
    Climbing Equipment
    Clean Water
    Machete
    Canoe
    Food Supplies

What number do you want to see the price of? 2
Torches cost 15 gold.
You search around the shop and find ledgers that show the following prices for these items: Rope: 10
gold, Torches: 15 gold, Climbing Equipment: 25 gold, Clean Water: 1 gold, Machete: 20 gold, Canoe: 200
gold, Food Supplies: 1 gold.

Objectives:

    Build a program that will show the menu illustrated above.
    Ask the user to enter a number from the menu.
    Using the information above, use a switch (either type) to show the item’s cost.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner input & variables
        Scanner scanner = new Scanner(System.in);
        int items = 0;
        int price = -1;
        // welcome message
        System.out.println("Welcome to the shop.");
        System.out.println("What can i help you with : ");
        
        System.out.println(price(scanner.nextInt()));
        // ask user for input which items the want displayed.
        scanner.close();
    }

    // build switch statement for list
    public static int price( int choice) {
        switch (choice) {
            case 1:
                return 10;
            case 2:
                return 15;
            case 3:
                return 25;
            case 4, 7:
                return 1;
            case 5:
                return 20;
            case 6:
                return 200;
            default:
                System.out.println("Input unknown, choose items from list 1 to 7 : ");
                return 0;
        }
    }
    // give scanner in method as parameter
    public static int grocerieList(Scanner scanner){
        // declare variable for choosing product : minus 1 (offset for choice
     int product = -1;
     // boolean for choosing products from list, give return value for another item or exit.
     while (true){
         // create list for items using switch statement
         System.out.println("Items for sale : ");
         System.out.println("1 - Rope");
         System.out.println("2 - Torches");
         System.out.println("3 - Climbing Equipment");
         System.out.println("4 - Clean Water");
         System.out.println("5 - Machete");
         System.out.println("6 - Canoe");
         System.out.println("7 - Food Supplies");
         System.out.print("Enter product : ");
         String input = scanner.nextLine();

         // if input == exit, return to menu.
         if (input.equalsIgnoreCase("exit")){
             System.out.println("Returning to menu"); //
             return 0;
         }
         product = Integer.parseInt(input);
         if (product >= 1 && product <= 7){
             return product;
         }else {
             System.out.println("Invalid option, choose from product 1 to 7.");
         }
     }
    }
}
