package invoice;

public class FakturaLinje {
    private String beskrivelse;
    private int antal;
    private String enhed;
    private int pris;

    public FakturaLinje(String beskrivelse, int antal, String enhed, int pris){
        this.beskrivelse = beskrivelse;
        this.antal = antal;
        this.enhed = enhed;
        this.pris = pris;
    }
    public int getBeløb(){
        return (antal*pris);
    }
    public String showInformation(){
        return beskrivelse + "        " + antal + "      " + enhed + "      " + pris + "     " + getBeløb();

    }
}
