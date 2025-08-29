package Com_PlayersGuide_KiersStefan.Challenge_22;
import Com_PlayersGuide_KiersStefan.Utils.Colours.Colours;

public class MainManticore {
    public static void main(String[] args) throws InterruptedException {
        // intro to main / fancy print statement
        System.out.println(Colours.RED + "\n\n \u001B[1m - * HUNTING THE MANTICORE * - \n\n " + Colours.RESET);
        //main game
        HuntingManticoreGame.run();
    }
}
