package Com_PlayersGuide_KiersStefan.ClassAssignments.Exponent;
import java.util.Scanner;

/*
Stefan Kiers
27-06-'25
Gecombineerd met de OddEvenTest.

In deze opdracht moet via de terminal een geheel positief getal opgegeven worden.
Het getal moet opgevraagd worden met behulp van de nextInt-methode uit de Scanner-klasse.
Zorg ervoor dat verkeerde invoer goed wordt afgehandeld door het programma.
Vervolgens moet de som van alle even getallen van 1 tot en met het opgegeven getal worden berekend.
Ook moet de som van alle oneven getallen van 1 tot en met het opgegeven getal worden berekend.
Tip: controleer of het getal een even getal is met de %.
Als laatste moet het verschil van deze twee sommen worden geprint.
Een voorbeeld van de uitvoer is:
 */


public class Main {
    public static void main(String[] args) {
        // import scanner for user input
        Scanner scanner = new Scanner(System.in);

        // welcome message + input for base and exponent
        // variable + identifier = input from user.
        System.out.println("Enter a positive whole number (2,4,6,8 etc) : ");
        int base = scanner.nextInt();
        if (base <= 0) {
            System.out.println("Incorrect input, enter positive number.");
        } else if (base % 2 != 0) {
            System.out.println("Incorrect input, number must be even.");
        } else {

        }
        System.out.println("Enter the exponent value : ");
        int exp = scanner.nextInt();

        // calculate and print outcome!
        // Math.pow ALWAYS uses a double variable, if you want to use Int -> cast them to correct
        // variables like : int varName = (int) Math.pow...
        int result = (int) Math.pow(base, exp);
        System.out.println(result);

        // make a boolean method that
        OddEvenTest.isOdd(result);

        // display odd and even total calculator.
        // class / method / parameter (outcome of main method from Math.pow)
        oddEvenTotalCalculator.oddEvenTotalCode(result);
        scanner.close();
    }
}
