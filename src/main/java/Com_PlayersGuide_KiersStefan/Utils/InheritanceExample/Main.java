package Com_PlayersGuide_KiersStefan.Utils.InheritanceExample;

/*
Example to learn about Inheritance in java
 */

public class Main {
    static void main() {

        // instantion of the child classes :
        // This is an Instance, which means we create an Object from the Class. By doing so, we can call upon it's
        // attributes and methods to execute operations.

        Car car = new Car(); // instantiation
        //car.drive(); // method call!
       //car.brake(); // method call!
        System.out.println("Print details of the class Car : "); // method call with instance variables from the parent class.
        car.printDetails(); // print details from the car, this is the method from the car class.
        System.out.println();

        // same with the motorcycle class.
        Motorcycle motorcycle = new Motorcycle(); // instantiation
        //motorcycle.drive();
        //motorcycle.brake(); // method call
        System.out.println("Print details of the class Motorcycle : ");
        motorcycle.printDetails();// print details from the motorcycle class.
        System.out.println();

        FordMustang mustang = new FordMustang("Shelby GT500", 320, "5.2-Liter Supercharged V8",
                "Shelby GT500 Cobra", "Leather - Black", 1967);
        mustang.printDetails();
        mustang.drive();
        mustang.activateSportsMode();
        mustang.activateTurbo();
    }
}
