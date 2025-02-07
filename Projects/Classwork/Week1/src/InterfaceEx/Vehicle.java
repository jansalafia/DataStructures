package InterfaceEx;

public interface Vehicle {
    
    String getModel();
    
    String speedUp();
    
    String slowDown();
    
    
    //The most common use of interface default methods is to incrementally provide additional functionality 
    //to a given type without breaking down the implementing classes.
    
    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }
    
    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
    
    
    
    //Since static methods don’t belong to a particular object, 
    //they’re not part of the API of the classes implementing the interface; therefore, 
    // they have to be called by using the interface name preceding the method name.

    //The idea behind static interface methods is to provide a simple mechanism that allows us 
    //to increase the degree of cohesion of a design by putting together related methods in one single place 
    //without having to create an object.
    
    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}