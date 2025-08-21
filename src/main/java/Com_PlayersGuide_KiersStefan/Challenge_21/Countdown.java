package Com_PlayersGuide_KiersStefan.Challenge_21;
import Com_PlayersGuide_KiersStefan.Challenge_22.ThreadCountdown;

/*
Stefan Kiers
20-07-'25

Objective : rewrite the following code, which counts down from 10 to 1, with no loops:
for (int x = 10; x > 0; x--)
 System.out.println(x);
(recursion)
 */
public class Countdown {
    public static void main(String[] args) {
//        for (int x = 10; x > 0; x--)
//            System.out.println(x);

        baseForRecursion(5);
        /*
        Recursion is the technique of making the function call itself. You can break complicated problems down to
        simpeler one that are easier to solve.
        It's used to apply the result of a procedure, to a procedure.

        Recursion = the repetition of a procedure.
        Iteration = repetition of the process.
         */

    }
    // psv int called base
    public static void baseForRecursion(int base) { // 2 usages, 1 = inside class, send is the call in run.
        // if base is greater than / equal to 0, return to recursive method call in run class (baseForRecursion)
        if (base <= 0) {
            return;
        }
        // print base that carries value of the recursive method at that time!
        System.out.print(base + " ");
        ThreadCountdown.waitSeconds(1);
        // start with 10, base -1, base becomes 9, base -1, base becomes 8 etc.
        // call the function again!
        baseForRecursion(base - 1);

        /*
        summary :
        baseFR int creates method for countdown.
        method is executed until base hits zero (determined in if statement)
        print statement for state of recursion
        baseFR - 1
        repeat function!
        value is determined in run class as parameters (in this case, 10)
         */
    }
}
