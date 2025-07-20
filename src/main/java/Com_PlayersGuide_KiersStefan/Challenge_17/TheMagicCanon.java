package Com_PlayersGuide_KiersStefan.Challenge_17;
import Com_PlayersGuide_KiersStefan.Utils.Colours.Colours;

/*
Stefan Kiers
17-07-2025


Write a program that will loop through the values between 1 and 100 and display what kind of blast
the crew should expect. (The % operator may be of use.)
Change the color of the output based on the type of blast. (For example, red for Fire, yellow for
Electric, and blue for Electric and Fire).

basic stuff is :
- loop for 1 to 100
- hit on 3rd (3,6,9 etc.) : fire canon
- hit on 5th (5,10,15 etc.) : eletric canon
- hit on nmbr where 3 & 5 align (15,30 etc.) : combocanon.

 */



public class TheMagicCanon {
    public static void main(String[] args) {
        /*
        use colours + reset for printstatements
        % for calculating the turn
        sout for normal canon.
         */

        // loop for index 1 to 100
        for(int index = 1; index < 100; index++){
            // when fire and electric both hit the number, use combo rocket.
            if (index % 3 == 0 && index % 5 == 0){
                System.out.println(Colours.BLUE_BRIGHT + "COMBOCANON!" + Colours.RESET); // combocanon, reset colours!
            } else if (index % 3 == 0) {
                System.out.println(Colours.RED + "Fire canon!" + Colours.RESET); // fire canon
            } else if (index % 5 == 0) {
                System.out.println(Colours.YELLOW + "Electric canon!" + Colours.RESET); // electric canon
            }else {
                System.out.println("Hit!"); // hit
            }
        }
    }
}
