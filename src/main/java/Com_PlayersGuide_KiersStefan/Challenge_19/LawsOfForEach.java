package Com_PlayersGuide_KiersStefan.Challenge_19;
/*
Stefan Kiers
17-07-'25

Assignment for the players guide, challenge 19 laws of freach.

- Start with the code for computing an array’s minimum and average values (see below)
- Modify the code to use foreach loops instead of for loops

A for each loop is used specificly to loop through elements in an array (or other data structures like
Arraylist, Hashmap, Hashset.)
Data structures are more flexible and feature rich (they are more dynamic).

Arraylist : resizable so it can grow when needed (more flexible, more dynamic)
Hashset : collection of unique items, no duplicates allowed.
HashMap : stores key value pairs (like country, capital / gender male, female etc), for storing values and finding them
with the key (name / id)

 */

public class LawsOfForEach {
    public static void main(String[] args) {
        /*
        Adjust the code to a for each loop :
        syntax :
        for ( Type (String/int etc) variableName : arrayName){
        code to be executed
        }
         */
        int[] arrayOfIntegers = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
        int currentHighest = Integer.MAX_VALUE; // find max value first! then loop down to lowest.
        // Max value holds the highest value in the array of Integers. The max value OF max value is the maximum
        // capacity of the prim-var int ( 2147483647 )

        for (int valueOfArray : arrayOfIntegers)
            {
                if (valueOfArray < currentHighest) currentHighest = valueOfArray;
            }
        System.out.println(currentHighest); // print statement

        /*
        Loop 2 :
        step by step :
        - remove index var
        - remove condition
        - remove increment
        - create loop-var to represent EACH element directly, then use that instead of aOI[index]

        original
        */

        int totalOriginal = 0;
        for (int index = 0; index < arrayOfIntegers.length; index++)
            totalOriginal += arrayOfIntegers[index];
        double averageOriginal = (double) totalOriginal / arrayOfIntegers.length;
        System.out.println(averageOriginal);

        // for each version :
        int totalForEach = 0;
        for (int newVarName : arrayOfIntegers){
            totalForEach += newVarName;
            System.out.print(newVarName + " ");
        }
        // print statement OUT of loop to seperate outcome and new for each loop.
        System.out.println();
        // cast to double for more precision.
        double averageForEach = (double) totalForEach / arrayOfIntegers.length;
        System.out.println("Average : " + averageForEach);
    }
}
/*
int[] arrayOfIntegers = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
        int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the arrayOfIntegers.
        for (int index = 0; index < arrayOfIntegers.length; index++)
        {
            if (arrayOfIntegers[index] < currentSmallest)
                currentSmallest = arrayOfIntegers[index];
        }
        System.out.println(currentSmallest);

        int total = 0;
        for (int index = 0; index < arrayOfIntegers.length; index++)
            total += arrayOfIntegers[index];
        double average = (double)total / arrayOfIntegers.length;
        System.out.println(average);
 */