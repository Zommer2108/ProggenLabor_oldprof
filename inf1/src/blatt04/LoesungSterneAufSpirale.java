package blatt04;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 * Zusatzaufgabe:
 * Klasse für das Zeichnen von Sternen entlang einer Spirale.
 * Wir leiten diesesmal von LoesungZufallsSterne ab, um die Methode
 * zeichneEinenStern wiederverwenden zu können.
 */
public class LoesungSterneAufSpirale extends LoesungZufallsSterne {


    public static final double DOUBLE = 0.5;

    /**
     * Konstruktor. Nichts zu ändern hier
     */
    public LoesungSterneAufSpirale() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1024, 768);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName());
        this.setVisible(true);
    }

    /**
     * Main-Methode. Nichts zu ändern hier.
     */
    public static void main(String[] args) {
        new LoesungSterneAufSpirale();
    }

    /**
     * Bitte ab hier Lösung zum Zeichnen der Sterne auf der Spirale entwickeln.
     */
    public void paint(Graphics g) {
        int xMiddlePos = this.getWidth() / 2;
        int yMiddlePos = this.getHeight() / 2;
        int radius = 10;
        int amountOfStars = 4;
        final int n = 8;
        double phi;
        int xPos = xMiddlePos;
        int yPos = yMiddlePos;

        this.zeichneEigenenStern(g, xPos, yPos, radius);
        for (int i = 1; i < amountOfStars; i++) {
            phi = i * (2 * Math.PI) / (double) n;
            xPos += 1.2 * (int) ((double) radius * Math.cos(phi));
            yPos += 1.2 * (int) ((double) radius * Math.sin(phi));
            radius += 14;
            this.zeichneEigenenStern(g, xPos, yPos, radius);
        }
    }
}
