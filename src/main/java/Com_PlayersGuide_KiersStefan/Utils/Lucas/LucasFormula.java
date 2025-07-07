package Com_PlayersGuide_KiersStefan.Utils.Lucas;

public class LucasFormula {
    // if : input > or = to 2, calculate lucas :
    public static int lucasFormula(int n){
        int Lucas;

        if(n == 0){
            Lucas = 2;
        } else if (n == 1) {
            Lucas = 1;
        }else {
            Lucas = lucasFormula(n -1) + lucasFormula(n - 2);
        }
        return Lucas;

        }
    }

