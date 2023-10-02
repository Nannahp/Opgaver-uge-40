package catlimb;

public class Cat {
        private String name;
        private boolean isChipped = false;
        public  Cat(String name,boolean chipped){
            setName(name);
            setChipped(chipped);
        }

    private void setName(String name) {
            this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setChipped(boolean chipped) {
        isChipped = chipped;
    }
    public boolean getChip(){
            return isChipped;
    }
}
