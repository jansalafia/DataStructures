package InterfaceEx;

public interface ElectricVehicle extends Vehicle {
	
	 default String TogglePowerSource(boolean electric) {
		 	if(electric == true)
		 		return "Setting the vehicle to electric.";
		 	else
		 		return "Setting the vehicle to petrol";
	 }
	 
}