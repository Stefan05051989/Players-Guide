package Com_PlayersGuide_KiersStefan.Challenge_07;

/*
Stefan Kiers
24-06-'25

“Hey! Programmer!” It’s the shopkeeper from the Variable Shop who hobbles over to you. “Thanks to
your help, variables are selling like RAM cakes! But these people just aren’t any good at programming.
They keep asking how to modify the values of the variables they’re buying, and… well… frankly, I have no
clue. But you’re a programmer, right? Maybe you could show me so I can show my customers?”


- Modify your Variable Shop program to assign a new, different literal value to each of the 9 original
  variables. Do not declare any additional variables.
- Use System.out.println to display the updated contents of each variable.

 */

public class TheVariableShopReturns {
    public static void main(String[] args) {

        String name = "Stefan";
        // String value : null;
        byte newByte = 127;
        // Byte size : -128 t/m 127
        short newShort = 32767;
        // Short size : -32768 t/m 32767
        int newInt = 2147483647;
        // Int Size : -2147483648 t/m 2147483647
        long newLong = 9223372036854775807L;
        // Long size :  -9223372036854775808 t/m 9223372036854775807
        float newFloat = 9.999999f;
        // Float : Sufficient for storing 6 to 7 decimal digits
        double newDouble = 1.0123456789123456d;
        // Double : Sufficient for storing 15 to 16 decimal digits
        boolean newBoolean = false;
        // Stores only 2 values : true or false!
        char newChar = 'X';
        // Char stores single character/letters or values (as used above) from the ASCII table
        // 64 in the ASCII table = @
        System.out.println(name + "\n" + newByte + "\n" + newShort + "\n" + newInt + "\n" +
                           newLong + "\n" + newFloat + "\n" + newDouble + "\n" + newBoolean + "\n" + newChar);
    }
}
