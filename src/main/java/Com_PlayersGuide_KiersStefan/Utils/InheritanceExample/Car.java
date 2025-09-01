package Com_PlayersGuide_KiersStefan.Utils.InheritanceExample;
/*
The car class is a subclasses (child class) from the Superclass (also parent class) Vehicle.
 */

public class Car extends Vehicle {
    protected String brand;
    protected String model;
    protected int wheels;
    protected int doors;
    protected String engine;

    // create constructor for Car details
    public Car() {
        //super(); // call parent without parameter instructions.
        this.type = "Car";
        this.brand = "Volkswagen";
        this.maxSpeed = 250;
        this.fuelType = "Gasoline";
        this.productionYear = 2004;
        this.brand = "Volkswagen";
        this.model = "Polo";
        this.wheels = 4;
        this.doors = 2;
        this.engine = "1.4 TSI 16V";
    }

    // instance method can directly acces the instance variables inside the class.
    // these will be printed without creating a new object
    public void printDetails() {
        super.printDetails(); // calls the constructor from the super class (Vehicle) to print the details for the Car class.
        System.out.println("Brand " + brand);
        System.out.println("Model : " + model);
        System.out.println("Wheels : " + wheels);
        System.out.println("Doors : " + doors);
        System.out.println("Engine type : " + engine);
    }
    //@Override
    public void drive(){
        System.out.println("Now the car is driving."); // prints this statement instead of "vehicle moving"
    }
    public void brake(){
        System.out.println("The car stopped.");
    }
}

