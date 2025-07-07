package Com_PlayersGuide_KiersStefan.Utils.Fibonacci;

/*
Stefan Kiers
07-07-'25

example of how fibonacci works with recursion
fibonacci(4)
= fibonacci(3) + fibonacci(2)
= [fibonacci(2) + fibonacci(1)] + [fibonacci(1) + fibonacci(0)]
= [[fibonacci(1) + fibonacci(0)] + 1] + [1 + 0]
= [[1 + 0] + 1] + [1 + 0]
= [1 + 1] + 1
= 2 + 1 = 3

it breaks it down into smaller pieces until base, then build back up.
 */

public class FibonacciFormula {
    public static int fibonacci(int n){
        int Fibonacci;

        if(n == 0){
            Fibonacci = 0;
        } else if (n == 1) {
            Fibonacci = 1;
        }else {
            // recursive formula :
            // recursion calls the method itself with it's own formula.
            // n-1 calls the method with n-1 as input, n-2 with n-2
            // it calls itself until it reaches base cases 0 or 1.
            // current number = previous 2 added together!
            // if it would not, you would have 3 different for loops with 3 different calculations
            Fibonacci = fibonacci(n - 1) + fibonacci(n - 2);

            // Since the function does not call itself when n is 0, the program stops there and returns the result.
        }
        return Fibonacci;
    }
}
