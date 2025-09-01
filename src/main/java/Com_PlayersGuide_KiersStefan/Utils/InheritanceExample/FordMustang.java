package Com_PlayersGuide_KiersStefan.Utils.InheritanceExample;
/*
specific example of inheritance using a parent class (Car), while Car is also the child of Vehicle.
 */

public class FordMustang extends Car{
    private String type;
    private String interiorColour;
    private boolean hasSportMode;
    private boolean hasTurbo;

    // generate constructor
    public FordMustang(String model, int maxSpeed, String engine, String type, String interiorColour, int productionYear){
        //super();
        // override Car's default values with parameters.
        this.type = "Muscle car";
        this.brand = "Ford";
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.productionYear = productionYear;
        this.doors = 2;
        this.wheels = 4;
        this.fuelType = "Gasoline";

        // model specifics
        this.type = type;
        this.interiorColour = interiorColour;
        this.hasSportMode = true;
        this.hasTurbo = engine.contains("Turbo") || engine.contains("Shelby Cobra package");
    }

    @Override
    public void printDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Wheels : " + wheels);
        System.out.println("Doors : " + doors);
        System.out.println("Engine type : " + engine);
        System.out.println("Interior : " + interiorColour);
        System.out.println("Sportsmode : " + (hasSportMode ? "Yes" : "No"));
        System.out.println("Turbo : " + (hasTurbo ? "Yes" : "No"));
    }
    @Override
    public void drive(){
        System.out.println("go baby go");
    }
    public void activateSportsMode(){
        if (hasSportMode){
            System.out.println("Sport package available.");
        }
    }
    public void activateTurbo(){
        System.out.println("Press button on shift-gear for turbo");
    }
}
