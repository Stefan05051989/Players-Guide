package Com_PlayersGuide_KiersStefan.Utils.LayOuts;

public class Grid {
    public static void main(String[] args) {
        int size = 21;
        String[][] field = new String[21][21];

    /*
    make the grid :
    make a for loop that uses a dot "." as placeholder
    This for-loop makes the blueprint for the grid :
    for : int variable for 20 rows, condition : if number of rows is smaller then 20,
    row increment/+ 1
    inner for loop : int var for columns, condition : if num of col is smaller then 20,
    col increment/+ 1.
     */
        for(int row = 0; row < 21; row++) { // print 20 rows
            for (int col = 0; col < 21; col++) { // print 20 columns
                field[row][col] = "."; // this prints the dot on every column / row
            }
        }
        System.out.println("   "); // ruimte voor rijnummers! deze worden geprint,
        //zowel als de nummer die "eroverheen"worden geprint.
        for (int col = 0; col < 21; col++){
            System.out.printf("%4s", col);
        }
        System.out.println("   ");
        for(int row = 1; row < 21; row++){
            System.out.printf("%4d | ", row);
            for (int col = 0; col < 20; col++){
                System.out.printf("%3s",field[row][col] + "   ");
            }
            System.out.println();
        }
    }
}

