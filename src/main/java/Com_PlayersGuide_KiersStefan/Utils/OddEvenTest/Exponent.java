package Com_PlayersGuide_KiersStefan.Utils.OddEvenTest;

public class Exponent {
    public static int exponent(int base, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++){
            result *= base;
        }
        return result;
    }
}
