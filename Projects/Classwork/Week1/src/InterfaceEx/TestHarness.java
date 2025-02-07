package InterfaceEx;

public class TestHarness {

	
	/* notice how the default methods, turnAlarmOn() and turnAlarmOff(), 
	 * from our Vehicle interface are available in the Car class without further implementation.
	 */
	
	public static void main(String[] args) { 
	    Vehicle car = new Car("Ford");
	    System.out.println(car.getModel());
	    System.out.println(car.speedUp());
	    System.out.println(car.slowDown());
	    
	    
	    //call the default methods of the car
	    System.out.println(car.turnAlarmOn());
	    System.out.println(car.turnAlarmOff());
	    
	    //static call the static method of the interface
	    System.out.println(Vehicle.getHorsePower(2500,480));
	    
	    
	    //test the extended interface
	    ElectricVehicle ev = new Car("Tesla");
	    ev.TogglePowerSource(true);
		System.out.println(ev.getModel());
	    System.out.println(ev.speedUp());
	    System.out.println(ev.slowDown());
	    
	    
	    //call the default methods of the car
	    System.out.println(ev.turnAlarmOn());
	    System.out.println(ev.turnAlarmOff());

	    
	    //static call the static method of the interface
	    System.out.println(Vehicle.getHorsePower(3000,480));
		
	}
}
