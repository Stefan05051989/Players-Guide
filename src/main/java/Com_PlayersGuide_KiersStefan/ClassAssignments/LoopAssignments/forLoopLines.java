package Com_PlayersGuide_KiersStefan.ClassAssignments.LoopAssignments;

/*
Stefan Kiers
30-04-'25

maak met behulp van een for loop de volgende uitkomst :

123
234
345
456
567
678
789
 */

public class forLoopLines {
    public static void main(String[] args) {
        // declare starting value
        int i = 0;

        // if 1 = 1 / i is smaller than 8 / i increment again
        for (i = 1; i < 8; i++){
            // print i (startingvalue)
            System.out.print(i);
            // print i + 1 ( number is i + 1 for every new line.
            System.out.print(i + 1);
            // i + 2 = i (first number) + 2 + new line.
            System.out.print(i + 2 + "\n");
        }
    }
}
