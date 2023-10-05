package moccamaster;

public class Cocoa extends Cup {
    String size;
    boolean withWhippedCream;

    public Cocoa(String size) {
        super("Cocoa");
        this.size = size;
    }

    public Cocoa(String size, boolean withWhippedCream) {
        super("Cocoa");
        this.size = size;
        this.withWhippedCream = withWhippedCream;
    }

    public void showCup() {
        if (withWhippedCream) {
            System.out.println( size + " " +name + " with whipped Cream");
        } else System.out.println( size+  " " + name);
    }
}