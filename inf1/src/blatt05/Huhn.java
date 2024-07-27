package blatt05;

public class Huhn {
    private String name;
    private boolean hunger;
    private static int anzahlHuehner;

    Huhn(String name) {
        this.name = name;
        this.hunger = true;
        Huhn.anzahlHuehner++;
    }

    public boolean getHunger() {
        return this.hunger;
    }

    public void setHungrig(boolean status) {
        this.hunger = status;
    }

    public String getName() {
        return this.name;
    }

    public static int getAnzahlHuehner() {
        return Huhn.anzahlHuehner;
    }
}
