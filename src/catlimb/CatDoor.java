package catlimb;

import java.util.Arrays;

public class CatDoor {
    private Modi doorMode;
    private Cat[] catsInMemory= new Cat[5];

    public CatDoor(){
        setDoorMode(Modi.CLOSED);
    }

    public void setDoorMode(Modi doorMode) {
        this.doorMode = doorMode;
    }

    public Modi getDoorMode() {
        return doorMode;
    }

    public boolean goingOut(){
        if (doorMode == Modi.CLOSED || doorMode == Modi.ONLY_IN) {
            return false;
        }else return true;
    }

    public boolean goingIn(Cat cat){
        if (doorMode == Modi.CLOSED || doorMode == Modi.ONLY_OUT){
            return false;}
            if (Arrays.asList(catsInMemory).contains(cat)){
                return true;}
        else return false;
    }
    public Cat[] getCatsInMemory(){
      return catsInMemory;
    }

    public void addMemory(Cat cat){
        int index=-1;
        for (int i = 0; i < catsInMemory.length; i++) {
            if ( catsInMemory[i] == null && cat.getChip()){ index = i;}
            }
        if (index != -1){ catsInMemory[index] = cat;}
    }
    public  void removeMemory(){
        Arrays.fill(catsInMemory, null);
        }
}
