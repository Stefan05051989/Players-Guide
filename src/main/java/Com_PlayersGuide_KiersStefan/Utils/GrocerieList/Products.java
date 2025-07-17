package Com_PlayersGuide_KiersStefan.Utils.GrocerieList;

import java.util.LinkedList;
/*
Stefan Kiers
07-07-'25

utility class for buying inventory program.

LinkedList :
A linkedList is a list that contains many objects of the same type (in this case, Strings (need to be converted to int later)
They both follow the lilst interface which means an ArrayList and a LinkedList contain the same methods.

You can change, add, remove, or clear elements the same as ArrayList.
The LinkedList stores it's elements in containers, unlike ArrayLists that store the items in the array.
(When an Array is not large enough, the List makes a copy of itself and adds the item that you want to put in the ArrayList.)

The LinkedList adds the new item in A NEW CONTAINER and adds them to the other containers in the list.
Much like shipping containers in the dock / port.

The LL has a few different methods to adjust the LL more efficiently ;
- addFirst(), addLast(),
 */

// class declaration
public class Products {
    // make list private so nobody can change it.
    LinkedList<String> productList;

    // method declaration
    public Products() {
        //declare list and add products :
        // geen reden voor LL, beter arraylist. (hardware geoptimaliseerd voor AL)
        productList = new LinkedList<>();
        productList.add("0 : TEST");
        productList.add("1 : Rope.");
        productList.add("2 : Torches.");
        productList.add("3 : Climbing Equipment.");
        productList.add("4 : Clean Water.");
        productList.add("5 : Machete.");
        productList.add("6 : Canoe.");
        productList.add("7 : Food Supplies.");

    }

    public static int getPrice(int choice) {
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

    public void showProducts() {
        System.out.println("Items available : ");
        for (String product : productList) {
            System.out.println(product);
        }
    }

    /*
    Override in java occurs when a childclass Overrides(!) a method that is allready defined in the parentclass.
    When a childclass provides its own version of the method in the parentclass, it's known as @Override.
    The childclass must match its parents name, parameters, return type.
    Static methods can not be overridden!

    Method overriding is a key concept in Java that enables Run-Time polymorphism.
    The productlist takes a new
     */
    @Override
    public String toString() {
        /*
        Why use StringBuilder :
        StringBuilder is more efficient and looks cleaner than this :
        String result = "Products available : "+ product1 + "\n" + product2 + "\n" + products3 etc etc.
         */
        // create stringbuilder
        StringBuilder stringBuilder = new StringBuilder();
        // append adss txt to what's allready there.
        stringBuilder.append("Products available : ");
        // enhanced for loop :
        // Takes each item from the product list one at a time.
        for (String product : productList) {
            // add each product + new line every time (method chain)
            stringBuilder.append(product).append("\n");
        }
        // sb.toString converts the StringBuilder to a regular string.
        return stringBuilder.toString();
    }
}
