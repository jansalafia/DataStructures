package InterfaceEx;

public class Car implements Vehicle, ElectricVehicle {

    private String model;
    
    // constructors/getters
    
    public Car(String model) {
    	this.model = model;
    }
    
    // methods Car is implementing 
    @Override
    public String getModel() {
        return model;
    }
    
    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }
    
    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }
}