package Com_PlayersGuide_KiersStefan.Utils.InheritanceExample;
/*
Child class from the parent "vehicle"
 */

public class Motorcycle extends Vehicle {
    protected String brand;
    protected String model;
    protected int wheels;
    protected String engine;
    protected boolean hasSideBar;

    // create constructor for Car details
    public Motorcycle() {
        this.type = "Motorcycle";
        this.maxSpeed = 330;
        this.fuelType = "Gasoline";
        this.productionYear = 2023;
        this.brand = "Yamaha";
        this.model = "R1";
        this.wheels = 2;
        this.engine = "1000-CC, Liquid-cooled, 4-Stroke";
        this.hasSideBar = false;
    }

    //@Override
    public void printDetails() {
        super.printDetails(); // calls the constructor from the super class (Vehicle) to print the details for the Car class.
        System.out.println("Brand " + brand);
        System.out.println("Model : " + model);
        System.out.println("Wheels : " + wheels);
        System.out.println("Engine type : " + engine);
        System.out.println("Has sidebar : " + hasSideBar);
    }
    @Override
    public void drive(){
        System.out.println("The motorcycle is on the left lane, anddddd it's gone..");
    }
    @Override
    public void brake(){
        System.out.println("Braking with a motorcycle can be tricky.");
    }

}
