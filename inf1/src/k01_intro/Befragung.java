

/**
 * Datei: Befragung.java
 * Erstes Java-Programmbeispiel
 */

package k01_intro;

import java.util.Scanner;

/**
 * @author Ulrich.Broeckl@hs-karlsruhe.de
 */
public class Befragung {

    /**
     * Geg.:   n Ja-/Nein-Fragen <br/>
     * Ges.:   Relative Haeufigkeiten p_i in Prozent, i = 1...n
     *
     * @param args unused
     */
    public static void main(String[] args) {
        int h;        // Anzahl Hoerende
        float p_i;    // Laufende Wahrscheinlichkeit in %

        System.out.println("Bitte Anzahl Hoerende eingeben:");
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        System.out.println("Es gibt " + h + " Hoerende.");

        System.out.println(
            "1. Persoenlicher Internetanschluss bzw. -zugang? Anzahl:");
        p_i = 100.f * sc.nextInt() / h;
        System.out.println("Anteil: " + p_i + "%");

        System.out.println("2. Eigener PC? Anzahl:");
        p_i = 100.f * sc.nextInt() / h;
        System.out.println("Anteil: " + p_i + "%");

        System.out.println("3. Wohnung in Karlsruhe? Anzahl:");
        p_i = 100.f * sc.nextInt() / h;
        System.out.println("Anteil: " + p_i + "%");

        System.out.println("4. Schon vorher studiert? Anzahl:");
        p_i = 100.f * sc.nextInt() / h;
        System.out.println("Anteil: " + p_i + "%");

        sc.close();
    }
}
