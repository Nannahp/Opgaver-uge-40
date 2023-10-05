package invoice;

import java.util.ArrayList;

public class Faktura {
    private int fakturaNummer;
    private String fakturaDato;
    private String forfalsDato;
    private FakturaUdsteder fakturaUdsteder;
    private FakturaModtager fakturaModtager;
    private ArrayList<FakturaLinje> fakturaLinjer = new ArrayList<>();
    private double subtotal;
    private double momsbeløb;
    private double fakturatotal;


    public Faktura(int fakturaNummer, FakturaUdsteder fakturaUdsteder, FakturaModtager fakturaModtager, String fakturaDato, String forfalsDato){
        setFakturaNummer(fakturaNummer);
        setFakturaUdsteder(fakturaUdsteder);
        setFakturaModtager(fakturaModtager);
        setFakturaDato(fakturaDato);
        setForfalsDato(forfalsDato);

    }

    public void setFakturaNummer(int fakturaNummer) {
        this.fakturaNummer = fakturaNummer;
    }

    public void setFakturaDato(String fakturaDato) {
        this.fakturaDato = fakturaDato;
    }

    public void setForfalsDato(String forfalsDato) {
        this.forfalsDato = forfalsDato;
    }

    public void setFakturaUdsteder(FakturaUdsteder fakturaUdsteder) {
        this.fakturaUdsteder = fakturaUdsteder;
    }

    public void setFakturaModtager(FakturaModtager fakturaModtager) {
        this.fakturaModtager = fakturaModtager;
    }

    public void addFakturaLinje(FakturaLinje fakturaLinje) {
        this.fakturaLinjer.add(fakturaLinje);

    }

    public void setSubtotal() {
        int subtotal = 0;
        for (FakturaLinje linje: fakturaLinjer) {
            subtotal += linje.getBeløb();
        }
        this.subtotal = subtotal;
    }
    public void setMomsbeløb(){
        this.momsbeløb = subtotal*0.25;
    }

    public void setFakturatotal() {
        this.fakturatotal = subtotal+momsbeløb;
    }

    public String getLinjeInformation(){
        String linjerSomStrings = "";
        for(FakturaLinje linje: fakturaLinjer) {
            linjerSomStrings += (linje.showInformation() + "\n");
        }return linjerSomStrings;}

    public String showInformation(){
        return fakturaModtager.showInformation() + "\n" +
                "Fakturanr.      " + fakturaNummer + "\n" +
                "Fakturadato     " + fakturaDato + "\n" +
                "Forfaldsdato    " + forfalsDato + "\n" +
                "At betale       " + fakturatotal + "\n\n" +
                "Beskrivelse   Antal    Enhed    Pris    Beløb" + "\n" +
                 getLinjeInformation() +
                "\nSubtotal uden moms: " + subtotal +"\n"+
                "Moms 25% af " + subtotal +":  " + momsbeløb + "\n" +
                "Total DKK: " + fakturatotal + "\n\n" + fakturaUdsteder.showInformation();
                }

}
