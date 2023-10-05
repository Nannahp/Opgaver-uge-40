package moccamaster;

public class Expresso extends  Cup{

    public Expresso(){
        super("Espresso");
    }

    public void showCup() {
        System.out.println(name);
    }
}
