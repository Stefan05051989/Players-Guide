package Com_PlayersGuide_KiersStefan.Challenge_09;
import java.util.Scanner;

/*
Stefan Kiers
24-06-'25

Create a program that lets the user enter the number of chocolate eggs gathered that day.
Using / and %, compute how many eggs each sister should get and how many are left over for the
duckbear.
Answer this question: What are the total egg counts where the duckbear gets more than each
sister does? You can use the program you created to help you find the answer.

formula : eggs per sister v= numbers of eggs / 4;
          eggs for the duckbear = number of eggs % 4
 */


public class TheFourSistersAndTheDuckbear {
    public static void main(String[] args) {
        // impport scanner
        Scanner input = new Scanner(System.in);
        // start program
        System.out.println("Enter the number of eggs found : ");
        // declare variables NOE based on input, EPS based on NOE divided by 4.
        int numberOfEggs = input.nextInt();
        int eggsPerSister = (numberOfEggs / 4);
        // print outcome and variables.
        System.out.println("Each sister will get : " + eggsPerSister + " eggs.");
        // calculate EFD : NOE % ( modulus) 4 (total number to divide in.
        // modulo returns the division remainder, Example :
        // 5 divided by 2 is not possible, it is possible to place 2 twice in 5.
        // so 5 / 2 = % 1 remaining after 2 fits twice in 5.
        int eggsForTheDuckbear = (numberOfEggs % 4);
        System.out.println("The Duckbear gets : " + eggsForTheDuckbear + " eggs.");



        for(int eggs = 0; eggs < 1000; eggs++){
            if (eggs % 4 > eggs /4){
                System.out.println("The duckbear gets more eggs at " + eggs + " eggs in total." );
            }
        }
        input.close();
    }
}
