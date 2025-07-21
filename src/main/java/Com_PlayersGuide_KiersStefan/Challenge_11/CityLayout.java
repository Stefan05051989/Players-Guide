package Com_PlayersGuide_KiersStefan.Challenge_11;
/*
Stefan Kiers
26-06-'25

Make a layout for the city of consolas.
The city is arranged in blocks, numbered like a chessboard.
You can assume its defenders are smart, so they can also move outside the city to say row -1 if needed.
 */

public class CityLayout {
    public static void main(String[] args) {
        // declare the variables :
        int column = 0;
        int row = 0;

        // the first loop will print the row from top to bottom (10 counting down to 0) with the first number between
        // the braces and the before the comma.
        for (row = 10; row > 0; row--){
        // The next loop with print the columns with the number after the comma.
            for (column = 1; column < 10; column++)
                System.out.print("[" + row + "," + column + "]");
            System.out.println();
        }
    }
}
