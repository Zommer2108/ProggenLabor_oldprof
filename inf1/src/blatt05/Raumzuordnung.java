package blatt05;

import blatt05.Person;

/**
 * Beispiel für Referenzen: Klasse für Mitarbeiter-Raumzuordnung
 */
public class Raumzuordnung {
    private Raum raum;        // Referenz auf Raum
    private Person nutzer;    // Referenz auf Nutzer/in
    private String grund;    // Grund der Raumzuordnung

    /**
     * Konstruktor
     */
    public Raumzuordnung(Raum raum, Person nutzer) {
        if (raum != null && nutzer != null) {
            this.raum = raum;
            this.nutzer = nutzer;
        } else {
            System.err.println("Raum oder Nutzer nicht gesetzt!");
        }
    }

    Raumzuordnung(Raum raum, Person nutzer, String grund) {
        this(raum, nutzer);
        if (grund != null && grund.length() >= 3) {
            this.grund = grund;
        } else {
            System.err.println("Grund muss mindestens 3 Zeichen lang sein!");
        }
    }

    public void print() {
        this.getNutzer().print();
        System.out.print(" nutzt den Raum: ");
        this.getRaum().print();
        System.out.println(" als " + this.getGrund());
    }

    Raum getRaum() {
        return this.raum;
    }

    Person getNutzer() {
        return this.nutzer;
    }

    String getGrund() {
        return this.grund;
    }

    void setGrund(String grund) {
        this.grund = grund;
    }

    public static void main(String[] a) {
        // Bröckl nutzt den Raum E 212a
        Person ub = new Person("Ulrich", "Bröckl");
        Raum e212a = new Raum("e 212a", 2);
        Raumzuordnung ub2e212a = new Raumzuordnung(e212a, ub, "Büro");
        ub2e212a.print();

        // Bröckl nutzt außerdem den Raum E 201
        Raumzuordnung ub2e201 = new Raumzuordnung(new Raum("e 201", 77, true),
            // keine Zwischenvariable für e201 nötig...
            ub);
        // Den Raum dieser Zuordnung ausgeben:
        System.out.print("\n     Außerdem: ");
        ub2e201.getRaum().print();
        System.out.println("\n");

        // Vogelsang nutzt den Raum E 209
        Raumzuordnung hv2e209 = new Raumzuordnung(new Raum("e 209", 3), new Person("Holger", "Vogelsang"), "Büro");
        hv2e209.print();

    }

}
