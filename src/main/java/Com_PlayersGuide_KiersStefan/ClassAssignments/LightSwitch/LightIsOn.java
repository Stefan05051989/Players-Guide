package Com_PlayersGuide_KiersStefan.ClassAssignments.LightSwitch;
/*
Stefan Kiers
01-07-2025

● Create a boolean lightIsOn.
● Set the value to ‘true’ or ‘false’
● Then create an if statement.

If the variable lightIsOn is true, print the text: “The light is on.”
 */

public class LightIsOn {
    public static void main(){

        boolean lightIsOn = true;
        if (!lightIsOn){
            System.out.println("The light is off.");
        }else{
            System.out.println("The light is on.");
        }
    }
}
