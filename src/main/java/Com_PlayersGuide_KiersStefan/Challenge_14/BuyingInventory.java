package Com_PlayersGuide_KiersStefan.Challenge_14;
import static Com_PlayersGuide_KiersStefan.Utils.DiscountCalculator.DiscountCalculator.ApplyDiscount;
import static Com_PlayersGuide_KiersStefan.Utils.DiscountCalculator.DiscountCalculator.employeeDiscount;
import Com_PlayersGuide_KiersStefan.Utils.GrocerieList.Products;
import java.util.Scanner;



/*
Stefan Kiers
29-06-'25

It is time to resupply. A nearby outfitter shop has the supplies you need but is so disorganized that they
cannot sell things to you. “Can’t sell if I can’t find the getPrice list,” Tortuga, the owner, tells you as he turns
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

What number do you want to see the getPrice of? 2
Torches cost 15 gold.
You search around the shop and find ledgers that show the following prices for these items: Rope: 10
gold, Torches: 15 gold, Climbing Equipment: 25 gold, Clean Water: 1 gold, Machete: 20 gold, Canoe: 200
gold, Food Supplies: 1 gold.

Objectives:

    Build a program that will show the menu illustrated above.
    Ask the user to enter a number from the menu.
    Using the information above, use a switch (either type) to show the item’s cost.
 */


public class BuyingInventory {
    public static void main(String[] args) {
        // import scanner
        Scanner scanner = new Scanner(System.in);
        // boolean for wrapping method while shopping = true.
        // boolean continueShopping = true;
        boolean discountStaff = true;

        // welcome message
        System.out.println("Welcome to the shop.");

        System.out.println("Enter your name : ");
        String employeeName = scanner.nextLine();
        // 15 : Adjust program to calculate 50% discount if user is shop staff.
        int discountPercentage = employeeDiscount(employeeName);
        System.out.println(discountPercentage);


        System.out.println("What items would you like to see : ");
        // instantiate and call products method :
        Products products = new Products();
        products.showProducts();
        // check : works!

        // boolean for repeating proces of asking to view item :
        //
        while (true){
            System.out.println("What item would you like to see the price of (select number) : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            // put choice variable (input) in String result and print
            // i've used String result = MakeChoice.getPrice(choice) + print,
            // but this cannot work because it takes a string while asking for int (choice)
            // Convert result to let the String take the value of int and print (parsing)
            // discription value.of : Returns the string representation of the int argument.
            //The representation is exactly the one returned by the Integer.toString method of one argument.
            // String result = String.valueOf(MakeChoice.getPrice(choice));
            double price = Products.getPrice(choice);
            double result = ApplyDiscount(discountPercentage, price);
            System.out.println(result);

            // check if user wants to see another item :
            System.out.println("Would you like to see another product ? (Y/N) : ");
            String anotherItem = scanner.nextLine();

            // loop for response and check if user wishes to continue.
            if (anotherItem.equalsIgnoreCase("N")){
                // insert boolean to exit the program!
                // continueShopping = false;
                // close off.
                System.out.println("Thanks for visiting the store.");
                // break gebruiken om uit de loop te komen, boolean CS niet nodig, CS = true in while)
                break;
            }else {
                // display items again when user ask for another look.
                products.showProducts();
            }
        }
        scanner.close();
    }
}
