package Com_PlayersGuide_KiersStefan.ClassAssignments.LightSwitch;

public class Main {
    public static void main(String[] args) {
        // create 2 new objects for lamps
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        // turn on the light by calling the method :
        led.turnOn();

        // same with halogen light but turn off
        halogen.turnOff();
    }
}
class Lamp{
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("The light is on ; " + isOn);
    }
    void turnOff(){
        isOn = false;
        System.out.println("The light is on ; " + isOn); // refers to negative on in turnOff method (false)
    }
}
