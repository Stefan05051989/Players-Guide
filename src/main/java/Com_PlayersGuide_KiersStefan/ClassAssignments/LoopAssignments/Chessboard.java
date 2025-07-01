package Com_PlayersGuide_KiersStefan.ClassAssignments.LoopAssignments;
/*
Stefan Kiers
01-07-2025

[moeilijk] Opdracht: Creëer het coördinatenstelsel van een schaakbord:
 */


public class Chessboard {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        for (j = 8; j > 0; j--) { // print 8 t/m 1 van boven naar beneden (1 kolom)
            for (i = 1; i < 8; i++) // print 1 t/m in rijen van links naar rechts
                System.out.print("(" + j + "," + i + ")");
            System.out.println();
        }
    }
}
