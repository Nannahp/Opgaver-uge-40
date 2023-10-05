package invoice;

public class FakturaModtager {
    private String adresse;
    private String postNummer;
    private String by;
    private String land;

    public FakturaModtager(String adresse, String postNummer, String by, String land){
        this.adresse = adresse;
        this.postNummer = postNummer;
        this.by = by;
        this.land = land;
    }
    public String showInformation(){
       return "\n\nMODTAGER \n" + adresse +"\n" +postNummer + " " + by +"\n" +
               land + "\n";
    }
}
