package Com_PlayersGuide_KiersStefan.ClassAssignments.Exponent;
/*
Stefan Kiers
27-06-'25

Method for calculating and displaying an even or odd number for the main assignment in this package.
 */

class OddEvenTest {
    static int isOdd(int result) {

        // check if even or uneven :
        if (result % 2 == 0) {
            System.out.println("Result is even");
        } else {
            System.out.println("Result is odd.");
        }
        return result;
    }
}
