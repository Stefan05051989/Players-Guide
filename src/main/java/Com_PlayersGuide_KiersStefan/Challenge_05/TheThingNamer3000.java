package Com_PlayersGuide_KiersStefan.Challenge_05;

import java.util.Scanner;

/*
Stefan Kiers
24-06-'25

“I dropped my Thing Namer 3000 and broke it. I think it’s mostly
working, but all my variable names got reset!
I don’t understand what they do!” He shows you the following program:
System.out.println("What kind of thing are we talking about?");
Scanner input = new Scanner(System.in);
String a = input.next();
System.out.println("How would you describe it? Big? Azure? Tattered?");
String b = input.next();
String c = "of Doom";
String d = "3000";
System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");

“You gotta help me figure it out!”

Objectives:

Rebuild the program above on your computer.
Add comments near each of the four variables that describe what they store.
You must use at least one of each comment type (/ / and / * * / ).
Find the bug in the text displayed and fix it.
Answer this question: Aside from comments, what else could you do to make this code more understandable?

 */


public class TheThingNamer3000 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Start with the program as stated above :
        System.out.println("What kind of thing are we talking about?");
        // ask user for discription
        String questionInput = input.nextLine();
        // elaborate on discription the user put in.
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        // choose 1 of these options
        String threeOptions = input.nextLine();
        // rename variable more specificly.
        String doom = "Doom";
        // changed to int variable for number input ( was also possible to stay string without double quotes,
        // then it would've just printed the number.
        int thingNamer= 3000;
        // Attach and print all the variables and words to combine.
        System.out.println("The " + threeOptions + " " + questionInput + " of " + doom + " " + thingNamer + "!");
    }
}

