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


        lastly :
        recursion eeds an halting condition, same as a loop.
        here's another example but with the halting condition :

        public class Products
        psvm
        int result = sum (5,10);
        sout -> result.

        ps int sum(int start, int end){
        if ( end > start){
        return end + sum (start, end -1);
        } else {
        return end;

        loop :
        sum(start, end)
        is the end > than start? -> yes.
        return 10 + sum(5,10)

        output : 45
        sum :
        - loop return 5
        - loop return 6 + (previous) 5 = 11
        - loop return 7 + (previous) 11 = 18
        - loop return 8 + (previous) 18 = 26
        - loop return 9 + (previous) 26 = 35
        - loop return 10 + (previous) 35 = 45
        base reached.

        exit loop, return sum

         */
    }

