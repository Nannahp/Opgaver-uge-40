package Vehicles;

public class Vehicle {

    private boolean isEngineOn;
    private String name;


    public void startEngine() {

        System.out.println("Starting engine..");
        isEngineOn = true;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}