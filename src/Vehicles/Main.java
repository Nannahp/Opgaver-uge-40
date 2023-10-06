package Vehicles;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car lambourgini = new Car();
        Car pourche = new Car();
        Ship ship = new Ship();
        Plane plane = new Plane();

        lambourgini.setName("Lambo");
        pourche.setName("P");
        ship.setName("Ship");
        plane.setName("Scandic");


        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(lambourgini);
        vehicles.add(pourche);
        vehicles.add(ship);
        vehicles.add(plane);


        for (int i = 0; i < vehicles.size(); i++) {

            System.out.println(vehicles.get(i).getName());
            vehicles.get(i).startEngine();

            if (vehicles.get(i) instanceof Car) {

                ((Car) vehicles.get(i)).drive();
            }
            else if (vehicles.get(i) instanceof Ship) {
                ((Ship) vehicles.get(i)).sail();
            }
            else if (vehicles.get(i) instanceof Plane) {
                ((Plane) vehicles.get(i)).fly();

            }


        }


    }
}