package Com_PlayersGuide_KiersStefan.Challenge_03;


/*
Stefan Kiers
23-06-'25

Make a program with 5 System.out.println statements in it.
Answer this question: How many statements do you think a program can contain?

IO : An I/O Stream represents an input source or an output destination
Programs use byte streams to perform input and output of 8-bit bytes.
All byte stream classes are descended from InputStream and OutputStream.


 */

public class TheMakingsOfAProgrammer {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("How many print statements are possible to print?");
        System.out.println("as much as your laptop / computer can handle.");
        // Even though the error printline is in the middle, it gets printed at the bottom after the rest of the program runs.
        System.err.println("oke 1.");
        System.out.println("oke 2.");
        System.out.println("oke 3.");

        // Some other printline examples :
        System.out.println(); // empty line
        System.out.println(x); // prints the value of variable x
        System.out.println(10); // prints 10 (not the value of x, just 10 as input.
        System.out.println('x'); // prints x (the char, because single quotes.
        System.out.println(10.10); // prints 10.10
        System.out.println(10!=10); // prints false
        System.out.println(Math.PI); // prints 3.14 (The value of pi (π) is an irrational number, approximately equal to 3.14159.)
        System.out.println("Hello World.");
        // Still, the error print statement prints all the way at the bottom.
    }
}
