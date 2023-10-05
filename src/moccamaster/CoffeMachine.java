package moccamaster;

import java.util.Scanner;

public class CoffeMachine {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        new CoffeMachine().run();
    }

    private void run() {
        System.out.println("What would you like to drink?");
        System.out.println("1) Black Coffee,  2) Epresso, 3) Double espresso, 4) Triple epresso, 5) Lattle Machiatto, 6) Cocoamilk, 7) Cccoa");
        Serve().showCup();

        }

    public Cup Serve(){
        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> {
                scanner.nextLine();//scanner bug
                System.out.println("Size: Small, Medium, Large");
                String size = scanner.nextLine();
                return new BlackCoffee(size);
    }
    case 2 -> {return new Expresso();}
            case 3 -> {
                return new DobbleEspresso();
            }
            case 4 -> {return  new TripleEspresso();}
            case 5 ->   {scanner.nextLine();//scanner bug
                System.out.println("Size: Small, Medium, Large");
            String size = scanner.nextLine();
            return new LatteMachiatto(size);}
            case 6 ->
            {scanner.nextLine();//scanner bug
                System.out.println("Size: Small, Medium, Large");
            String size = scanner.nextLine();
            System.out.println("Add whipped cream? (y/n)");
            String whippedCream = scanner.nextLine();
            if(whippedCream.contains("y"))
                return new CocoaMilk(size, true);
            else { return new CocoaMilk(size);
            }}
            case 7 ->
            {scanner.nextLine();//scanner bug
                 System.out.println("Size: Small, Medium, Large");
            String size = scanner.nextLine();
            System.out.println("Add whipped cream? (y/n)");
            String whippedCream = scanner.nextLine();
            if(whippedCream.contains("y"))
                return new Cocoa(size, true);
            else { return new Cocoa(size);}
            }
            default -> {
                return new Cup("empty");
            }
        }

}
}
