package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse für das Zeichnen eines Sterns
 */
public class LoesungStern extends JFrame {


    /**
     * Konstruktor. Nichts zu ändern hier
     */
    public LoesungStern() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName());
        this.setVisible(true);
    }

    /**
     * Main-Methode. Nichts zu ändern hier.
     */
    public static void main(String[] args) {
        new LoesungStern();
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


        this.meinStern(g); // Aufruf der selbst programmierten Methode
    }

    /**
     * Hier bitte die Lösung, um den Stern zu zeichnen
     */
    public void meinStern(Graphics g) {
        int xMiddlePos = this.getWidth() / 2;
        int yMiddlePos = this.getHeight() / 2;
        int radius = yMiddlePos / 2;
        this.zeichneEigenenStern(g, xMiddlePos, yMiddlePos, radius);
    }

    private void zeichneEigenenStern(Graphics g, int xMiddlePos, int yMiddlePos, int radius) {
        int xPos;
        double phi;
        int yPos;
        final int AMOUNT_OF_LINES = 64;

        for (int i = 0; i < AMOUNT_OF_LINES; i++) {
            //calculation of turning angle
            phi = i * (2 * Math.PI) / AMOUNT_OF_LINES;
            int calcRadius = radius;

            if (i % 2 != 0) {
                calcRadius = radius / 2;
                g.setColor(Color.MAGENTA);
            } else {
                g.setColor(Color.BLUE);
            }

            //calculating new positions of the separate lines
            xPos = (int) (calcRadius * Math.cos(phi));
            yPos = (int) (calcRadius * Math.sin(phi));
            g.drawLine(xMiddlePos, yMiddlePos, xPos + xMiddlePos, yPos + yMiddlePos);
        }
    }
}
