package catlimb;

import java.util.ArrayList;

public class RunProgram {
    ArrayList<Cat> catArray = new ArrayList<>();
    CatDoor door = new CatDoor();
    public static void main(String[] args) {
        new RunProgram().run();
    }

    private void run() {
        makeCats();
        door.setDoorMode(Modi.IN_OUT);
        System.out.println(door.getDoorMode());
        printResult();

        door.setDoorMode(Modi.ONLY_IN);
        System.out.println(door.getDoorMode());
        printResult();

        door.setDoorMode(Modi.ONLY_OUT);
        System.out.println(door.getDoorMode());
        printResult();

        door.setDoorMode(Modi.CLOSED);
        System.out.println(door.getDoorMode());
        printResult();

        System.out.println("5 Cats in record:");
        for (int i =0; i < door.getCatsInMemory().length; i++) {
            if (door.getCatsInMemory()[i] != null)
                System.out.println(door.getCatsInMemory()[i].getName());
            else System.out.println(door.getCatsInMemory()[i]);
        }
        System.out.println("Delete record");

        door.removeMemory();
        for (int i =0; i < door.getCatsInMemory().length; i++) {
            if (door.getCatsInMemory()[i] != null)
                System.out.println(door.getCatsInMemory()[i].getName());
            else System.out.println(door.getCatsInMemory()[i]);
        }

    }
    public void makeCats(){
        for (int i = 1; i < 7; i++) {
            String name = ("c" + i);
            Cat newCat = new Cat(name,true);
            door.addMemory(newCat);
            catArray.add(newCat);
        }
        catArray.get(5).setChipped(false);

    }
    private void printResult(){
        System.out.println(catArray.get(0).getName() + ":  in= " + door.goingIn(catArray.get(0)) + " | out= " + door.goingOut());
        System.out.println(catArray.get(4).getName() + ":  in= " + door.goingIn(catArray.get(4)) + " | out= " + door.goingOut());
        System.out.println(catArray.get(5).getName() + ":  in= " + door.goingIn(catArray.get(5)) + " | out= " + door.goingOut());
        }


}
