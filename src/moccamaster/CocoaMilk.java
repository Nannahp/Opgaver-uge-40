package moccamaster;

public class CocoaMilk extends Cup {
    String size;
    boolean withWhippedCream;

    public CocoaMilk(String size){
        super("CocoaMilk");
        this.size = size;
    }
    public CocoaMilk(String size, boolean withWhippedCream){
        super("CocoaMilk");
        this.size = size;
        this.withWhippedCream = withWhippedCream;
    }

    public void showCup() {
        if (withWhippedCream) {
            System.out.println( size + " " +name + " with whipped Cream");
        } else System.out.println( size + " " + name);
    }
}
