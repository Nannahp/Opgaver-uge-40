package moccamaster;

public class BlackCoffee extends Cup {
    String size;

    public BlackCoffee(String size){
        super("Black Coffee");
        this.size = size;

    }

    public void showCup() {
        System.out.println( size +" " + name);
    }
}
