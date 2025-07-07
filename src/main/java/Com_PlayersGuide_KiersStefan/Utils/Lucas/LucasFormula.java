package Com_PlayersGuide_KiersStefan.Utils.Lucas;

public class LucasFormula {
    // if : input > or = to 2, calculate lucas :
    public static int lucasFormula(int n){
        // declare variable
        int Lucas;

        // formula for calculating lucas :
        if(n == 0){
            Lucas = 2;
        } else if (n == 1) {
            Lucas = 1;
        }else {
            // recursion is a method where the method calls itself !
            // see fibonacci also.
            Lucas = lucasFormula(n -1) + lucasFormula(n - 2);
        }
        // return outcome.
        return Lucas;
        }
        /*
        if i would have made the formula in the iterative way, it would look like this :

        - base values
        if (n == o) return 2;
        if (n == 1) return 1;

        - initialize variables to store previous lucas numbers.
        long a = 2, b = 1;
        - loop from position 2 -> n
        for(int i = 2; i <=; i++){
            long temp = a + b; -> calculate L(i) = L(i-1) + L(i-2)
            a = b;  -> store variable b in a!
            b = temp;   -> stpre the new Lucas number in B.
         }
         return b;
       }
       The variable had to be stored in a temporary variable because it cannot calculate it while being used
       in another variable.
       this makes the formula much more difficult to calculate and this is why recursive is the best option
       for these type of assignments.

         */
    }

