package invoice;

import java.util.ArrayList;
import java.util.Arrays;

public class FakturaUdsteder {
    private ArrayList<String> dinVirksomhed = new ArrayList<>() ;
    private String email;
    private int cvr;
    private int momsNr;
    private int euMomsNr;

    public FakturaUdsteder(String adresse, String postNummer, String by, String virksomhedsNavn, String email,int cvr,int momsNr, int euMomsNr){
        this.email = email;
        this.cvr = cvr;
        this.momsNr = momsNr;
        this.euMomsNr = euMomsNr;
        setDinVirksomhed(adresse, postNummer, by, virksomhedsNavn);
    }

    public void setDinVirksomhed(String adresse, String postnummer, String by, String virksomehdsnavn){
        dinVirksomhed.addAll(Arrays.asList(adresse,postnummer,by,virksomehdsnavn));
    }

    public String showInformation(){
        return "Virksomehd: " + dinVirksomhed.toString() + "\n" +
                "E-mail: " + email + "\nCVR: " +cvr +"\n" +
                "Momsnr: " + momsNr + "\n" + "EU-momsnummer: " + euMomsNr;
    }
}
