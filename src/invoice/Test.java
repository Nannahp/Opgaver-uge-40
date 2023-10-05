package invoice;

public class Test {
    public static void main(String[] args) {
        new Test().run();
    }

    private void run() {
        FakturaUdsteder udsteder = new FakturaUdsteder("Urgade 2","2300", "København", "Zebra A/S","zebra@live.dk",12345,9873,34566);
        FakturaModtager modtager = new FakturaModtager("Arne Jacobsens alle 7", "2300", "København", "Danmark");
        Faktura faktura = new Faktura(445678, udsteder,modtager, "1/12/23", "21/12/23");
        faktura.addFakturaLinje(new FakturaLinje("Tung bog", 1, "stk.", 600));
        faktura.addFakturaLinje(new FakturaLinje("Let bog ", 2,"stk.", 800));
        faktura.setSubtotal();
        faktura.setMomsbeløb();
        faktura.setFakturatotal();
        System.out.println(faktura.showInformation());
    }
}
