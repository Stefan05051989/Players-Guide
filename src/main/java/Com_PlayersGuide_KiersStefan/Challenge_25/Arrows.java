package Com_PlayersGuide_KiersStefan.Challenge_25;
import Com_PlayersGuide_KiersStefan.Challenge_20.TakingANumber;
import java.util.Scanner;

enum Arrowhead {
    STEEL, WOOD, OBSIDIAN
}

enum Fletching {
    PLASTIC, TURKEYFEATHERS, GOOSEFEATHERS
}

record Arrow(int arrowLength, Arrowhead selectedArrowhead, Fletching fletchingChoice) {

    public float getCost() {
        float cost = 0;

        // Arrowhead price
        switch (selectedArrowhead) {
            case STEEL:
                cost += 10;
                break;
            case WOOD:
                cost += 3;
                break;
            case OBSIDIAN:
                cost += 5;
                break;
        }

        // Fletching price
        switch (fletchingChoice) {
            case PLASTIC:
                cost += 10;
                break;
            case TURKEYFEATHERS:
                cost += 5;
                break;
            case GOOSEFEATHERS:
                cost += 3;
                break;
        }
        // Length price =  0.05 gold per centimeter
        cost += arrowLength * 0.05f;

        return cost;
    }

    @Override
    public String toString() {
        return arrowLength + "cm " + selectedArrowhead + " arrow with " + fletchingChoice + " fletching";
    }
}

public class Arrows {
    public static void main(String[] args) {
        Scanner userChoice = new Scanner(System.in);
        System.out.println("Hi there, I am Vin Fletcher.");
        System.out.println("Here you can choose your materials and length of the Arrow you wish.");
        System.out.println();

        // Choose length of arrow
        int arrowLength = TakingANumber.AskForNumber(new Scanner(System.in),
                "Choose the length of the shaft starting from ", 60, 100);
        System.out.println("Your choice: " + arrowLength);
        System.out.println();

        // Choose arrowhead
        System.out.println("Now pick your materials for the head of the arrow:");
        System.out.println("1. Steel");
        System.out.println("2. Wood");
        System.out.println("3. Obsidian");
        System.out.print("Enter your choice: ");

        int arrowHeadChoice = userChoice.nextInt();
        Arrowhead selectedArrowHead = null;

        switch (arrowHeadChoice) {
            case 1:
                selectedArrowHead = Arrowhead.STEEL;
                break;
            case 2:
                selectedArrowHead = Arrowhead.WOOD;
                break;
            case 3:
                selectedArrowHead = Arrowhead.OBSIDIAN;
                break;
            default:
                System.out.println("Invalid choice, try again.");
                return;
        }
        System.out.println("Selected Arrowhead: " + selectedArrowHead);
        System.out.println();

        // Choose fletching
        System.out.println("Now choose your fletching type:");
        System.out.println("1. Plastic");
        System.out.println("2. Turkey Feathers");
        System.out.println("3. Goose Feathers");
        System.out.print("Enter your choice: ");

        int fletchingChoice = userChoice.nextInt();
        Fletching selectedFletching = null;

        switch (fletchingChoice) {
            case 1:
                selectedFletching = Fletching.PLASTIC;
                break;
            case 2:
                selectedFletching = Fletching.TURKEYFEATHERS;
                break;
            case 3:
                selectedFletching = Fletching.GOOSEFEATHERS;
                break;
            default:
                System.out.println("Invalid choice, defaulting to Plastic.");
                selectedFletching = Fletching.PLASTIC;
                break;
        }
        System.out.println("Selected Fletching: " + selectedFletching);
        System.out.println();

        // Create arrow and display cost
        Arrow customArrow = new Arrow(arrowLength, selectedArrowHead, selectedFletching);
        System.out.println("Your custom arrow: " + customArrow);
        System.out.println("Total cost: " + customArrow.getCost() + " gold");

        userChoice.close();
    }
}