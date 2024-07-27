package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse für das zufällige Zeichnen von Sternen
 */
public class LoesungZufallsSterne extends JFrame {

    /**
     * Konstruktor. Nichts zu ändern hier
     */
    public LoesungZufallsSterne() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1024, 768);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName());
        this.setVisible(true);
    }

    /**
     * Paint-Methode. Nichts zu ändern hier. Diese Methode
     * wird beim Öffnen des Fensters automatisch aufgerufen.
     * Die Methode wird auch aufgerufen, wenn die Größe des Fensters
     * verändert wird.
     *
     * @param g Grafik, auf die gezeichnet wird.
     */
    public void paint(Graphics g) {
        /* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
        g.clearRect(0, 0, this.getWidth(), this.getHeight());


        this.meineZufallsSterne(g); // Aufruf der selbst programmierten Methode
    }

    /**
     * Main-Methode. Nichts zu ändern hier.
     */
    public static void main(String[] args) {
        new LoesungZufallsSterne();
    }

    /**
     * Bitte ab hier Lösung zum Zeichnen der zufälligen Sterne entwickeln.
     */
    /**
     * 1. Teilaufgabe: Methode, um einen Stern zu zeichnen.
     *
     * @param g    Grafikbereich, auf dem gezeichnet wird
     * @param midX x-Koordinate des Mittelpunkts des Sterns
     * @param midY y-Koordinate des Mittelpunkts des Sterns
     * @param r    Radius des Sterns
     */
    public void zeichneEigenenStern(Graphics g, int midX, int midY, int r) {
        double phi = 0;
        int xPos;
        int yPos;
        final int AMOUNT_OF_LINES = 128;

        for (int i = 0; i < AMOUNT_OF_LINES; i++) {

            phi = i * (2 * Math.PI) / AMOUNT_OF_LINES;
            int calcRadius = 0;

            if (i % 2 != 0) {
                calcRadius = r / 2;
                g.setColor(Color.MAGENTA);
            } else {
                calcRadius = r;
                g.setColor(Color.BLUE);
            }

            xPos = (int) (calcRadius * Math.cos(phi));
            yPos = (int) (calcRadius * Math.sin(phi));
            g.drawLine(midX, midY, xPos + midX, yPos + midY);
        }
    }

    /**
     * 2. Teilaufgabe: Sterne zufällig platzieren mit zufälligem Radius
     */

    public void meineZufallsSterne(Graphics g) {
        final int PERCENTAGE_OF_ONEHUNDRED = 100;
        double amountOfStars = Math.random() * PERCENTAGE_OF_ONEHUNDRED;

        for (int i = 0; i < amountOfStars; i++) {
            int xPos = (int) (Math.random() * this.getWidth());
            int yPos = (int) (Math.random() * this.getHeight());
            int radius = (int) (Math.random() * PERCENTAGE_OF_ONEHUNDRED);
            zeichneEigenenStern(g, xPos, yPos, radius);
        }
    }
}
