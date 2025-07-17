package Com_PlayersGuide_KiersStefan.Utils.DiscountCalculator;
import java.util.ArrayList;

/*
Method for calculating 50% discount applying to Buying inventory.
 */

public class DiscountCalculator {
    // add scanner as parameter, closes automatically after method is finished.
    public static int employeeDiscount(String employeeName) {
        // Create ArrayList for staff.
        ArrayList<String> staffMembers = new ArrayList<>();
        staffMembers.add("stefan");
        staffMembers.add("joris");
        staffMembers.add("siem");

        // check if staff :
//        System.out.println("Enter your name : ");
//        String employeeName = scanner.nextLine();
        if (staffMembers.contains(employeeName.toLowerCase())) {
            System.out.println("Hey " + employeeName + " you get 50% discount!");
            return 50;
        } else {
            System.out.println("No discount.");
        }return 0;
    }

    // calculate discount for personal.
    public static double ApplyDiscount (int discountPercentage, double price) {
        return price * discountPercentage / 100;
    }
}
