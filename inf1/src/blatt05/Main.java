package blatt05;

public class Main {
    public static void main(String[] args) {
        Bauer walter = new Bauer("Walter");
        Huhn heidrun = new Huhn("Heidrun");
        Huhn heike = new Huhn("Heike");
        Huhn hannelore = new Huhn("Hannelore");


        walter.rufeHuhn(heidrun);
        walter.fuettern(heidrun);
        System.out.println(heidrun.getHunger());
        System.out.println();

        walter.rufeHuhn(heike);
        walter.fuettern(heike);
        System.out.println(heike.getHunger());
        System.out.println();

        walter.rufeHuhn(hannelore);
        walter.fuettern(hannelore);
        walter.fuettern(hannelore);
        System.out.println(hannelore.getHunger());
        System.out.println();

        System.out.println(walter.berechneAnzahlHungrigerHuehner());
    }
}
