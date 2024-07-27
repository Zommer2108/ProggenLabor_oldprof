package blatt03;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungKegel extends JFrame {

    /**
     * Konstruktor. Nichts zu ändern hier
     */
    public LoesungKegel() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(610, 417);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName());
        this.setVisible(true);
    }

    /**
     * Main-Methode. Nichts zu ändern hier.
     */
    public static void main(String[] args) {
        new LoesungKegel();
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


        this.meinKegel(g); // Aufruf der selbst programmierten Methode
    }

    /**
     * Hier bitte die Lösung, um den Kegel zu zeichnen
     */
    public void meinKegel(Graphics g) {
        //distances between the inner lines
        final int NEW_Y_POSITION = 1;
        final int DISTANCE_X = 8;
        final int X_LIMIT_EXTENSION = 20;

        int x25 = this.getWidth() / 4;
        int x75 = this.getWidth() * 3 / 4;
        int y25 = this.getHeight() / 4;
        int y75 = this.getHeight() * 3 / 4;

        //new limit for the x-axis so the correct amount of lines can be drawn
        int xLimit = x75 + X_LIMIT_EXTENSION;

        /*setting color for the inner lines
        and set new starting positions for the inner lines*/
        g.setColor(Color.LIGHT_GRAY);
        x25 += DISTANCE_X;
        xLimit -= DISTANCE_X;
        y25 += NEW_Y_POSITION;
        y75 -= NEW_Y_POSITION;

        int counter = 0;
        for (int xPositionOne = x25, xPositionTwo = xLimit; xPositionOne < xLimit;
             xPositionOne += DISTANCE_X, xPositionTwo -= DISTANCE_X) {

            g.drawLine(xPositionOne, y25, xPositionTwo, y75);
            System.out.println("Linie : " + counter);
            counter++;
        }
        //drawing the outer lines
        g.setColor(Color.BLACK);
        g.drawLine(x25, y25, xLimit, y25);
        g.drawLine(x25, y75, xLimit, y75);
        g.drawLine(x25, y25, xLimit, y75);
        g.drawLine(x25, y75, xLimit, y25);
    }
}
