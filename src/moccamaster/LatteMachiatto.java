package moccamaster;

public class LatteMachiatto extends  Cup{
    String size;

    public LatteMachiatto(String size){
        super("Latte Machiatto");
        this.size = size;
    }

    public void showCup() {
        System.out.println(size +" " + name);
    }

}
