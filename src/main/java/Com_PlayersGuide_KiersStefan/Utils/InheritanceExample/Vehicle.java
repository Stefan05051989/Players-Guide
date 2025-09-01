package Com_PlayersGuide_KiersStefan.Utils.InheritanceExample;
/*
The vehicle is the parent class (Superclass) of the Car and the Motorcycle.
In this class, the attributes and behaviour is defined.
Inheritance is used with the keyword extends, The car class extends the vehicle class to adopt it's methods and
attributes (motorcycle as well)
To use the attributes and methods through inheritance, we instantiate the child classes bij creating new objects
from them, then we call the methods within the class by using the classname. function, this allows us to use all
the methods within the class.

The more detailed you make the parent class, the easier it gets to let the child classes adopt all of the
attributes and methods.

 */

public class Vehicle {

    // first we declare the variables (the specifications) of a vehicle.
    // a vehicle can have wheels, an engine, brakes, doors, pedals, gashandle etc.
    protected String type;
    protected int maxSpeed;
    protected String fuelType;
    protected int productionYear;


    // create constructor
    public Vehicle(){
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
    }
    // create print details method
    public void printDetails(){
        System.out.println("Type = " + type);
        System.out.println("Max speed = " + maxSpeed);
        System.out.println("Fuel type = " + fuelType);
        System.out.println("Year of production " + productionYear);
    }


    // then we create a method based of the variables with it's own function.
    void drive(){
        System.out.println("vehicle is moving.");
    }
    // method for braking
    void brake(){
        System.out.println("vehicle stopped.");
    }
}
