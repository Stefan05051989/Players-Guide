package Com_PlayersGuide_KiersStefan.ClassAssignments.Exponent;

/*
Stefan Kiers
27 -6 -'25

Method for calculating the sum of even and odd numbers,
created in the Products method for this assignment.
 */

class oddEvenTotalCalculator {
    static void oddEvenTotalCode(int maxNumber) {
        // calculate the sum of even and odd numbers :
        // declare variables
        int evenNumbers = 0;
        int oddNumbers = 0;

        // use a for loop to calculate which numbers are calculated in the sum off even and odd.
        for (int i = 1; i <= maxNumber; i++) {
            if (i % 2 == 0) {
                evenNumbers += i;
            } else {
                oddNumbers += i;
            }
        }
        // display results
        System.out.println("Sum of even numbers = " + evenNumbers);
        System.out.println("Sum of odd numbers = " + oddNumbers);
    }
}
