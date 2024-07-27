package blatt05;

public class Bauer {
    private String name;
    private static int anzahlGefuetterteHuehner;

    public Bauer(String name) {
        this.name = name;
    }

    public void fuettern(Huhn huhn) {
        if (huhn.getHunger()) {
            huhn.setHungrig(false);
            Bauer.anzahlGefuetterteHuehner++;
        }
    }

    public void rufeHuhn(Huhn huhn) {
        System.out.println(huhn.getName());
    }

    public int berechneAnzahlHungrigerHuehner() {
        int anzahlHuehner = Huhn.getAnzahlHuehner();
        return anzahlHuehner - Bauer.anzahlGefuetterteHuehner;
    }
}
