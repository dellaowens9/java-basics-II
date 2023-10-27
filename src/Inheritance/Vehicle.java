package Inheritance;

public abstract class Vehicle {
    int wheels = 4; 
    String make; 
    String model; 

    public Vehicle(){};

    public Vehicle(int wheels, String make, String model){
        this.wheels = 4; 
        this.make = make; 
        this.model = model; 
    }

    public String getMake(){
        return this.make; 
    }

    public String getModel(){
        return this.model;
    }

    public int wheels(){
        return this.wheels; 
    }
}
